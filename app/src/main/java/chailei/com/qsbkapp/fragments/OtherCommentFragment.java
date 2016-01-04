package chailei.com.qsbkapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

import chailei.com.qsbkapp.R;
import chailei.com.qsbkapp.adapters.CommentAdapter;
import chailei.com.qsbkapp.entity.Entitys;
import chailei.com.qsbkapp.entity.ItemData;
import chailei.com.qsbkapp.entity.QsbkService;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class OtherCommentFragment extends Fragment implements Callback<Entitys> {

    private ListView listView;
    private CommentAdapter adapter;
    private int id;

    public OtherCommentFragment() {
        // Required empty public constructor
    }

    public static OtherCommentFragment newInstance(int tempId) {

        Bundle args = new Bundle();
        args.putInt("id", tempId);
        OtherCommentFragment fragment = new OtherCommentFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_other_comment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        TextView textView = (TextView) view.findViewById(R.id.other_comment_title);
        id = getArguments().getInt("id");
//        textView.setText(data);

        listView = (ListView) view.findViewById(R.id.other_comment_list_view);
        adapter = new CommentAdapter(getContext());
        listView.setAdapter(adapter);

        QsbkService.getCommentService().getList(id, 1).enqueue(this);
        //为什么直接实例化TextView不可以？？？？
    }

    @Override
    public void onResponse(Response<Entitys> response, Retrofit retrofit) {
        adapter.addAll(response.body().getItems());
    }

    @Override
    public void onFailure(Throwable t) {
        t.printStackTrace();
        Toast.makeText(getContext(),"网络失败",Toast.LENGTH_SHORT).show();
    }
}
