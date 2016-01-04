package chailei.com.qsbkapp.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import chailei.com.qsbkapp.CommentActivity;
import chailei.com.qsbkapp.OtherCommentActivity;
import chailei.com.qsbkapp.R;
import chailei.com.qsbkapp.adapters.ShiInfoAdapter;
import chailei.com.qsbkapp.entity.Entitys;
import chailei.com.qsbkapp.entity.ItemData;
import chailei.com.qsbkapp.entity.QsbkService;
import chailei.com.qsbkapp.utils.InitShiData;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShiInfoFragment extends Fragment implements Callback<Entitys> ,PullToRefreshBase.OnRefreshListener2, View.OnClickListener {


    private static final String TAG = "SHI";
    private Call<Entitys> call;
    private ShiInfoAdapter adapter;
    private PullToRefreshListView listView;

    private int page =1;
    private String type;

    public ShiInfoFragment() {
        // Required empty public constructor
    }

    public static ShiInfoFragment newInstance(String str) {

        Bundle args = new Bundle();
        args.putString(TAG,str);
        ShiInfoFragment fragment = new ShiInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shi_info, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        type = getArguments().getString(TAG);
         listView = (PullToRefreshListView) view.findViewById(R.id.list_view);
        adapter = new ShiInfoAdapter(getContext());
        listView.setAdapter(adapter);
        listView.setMode(PullToRefreshBase.Mode.BOTH);
        listView.setOnRefreshListener(this);
        adapter.setOnClickListener(this);
        QsbkService.ArticleService  articleService = QsbkService.getArticleService();
        call = articleService.getList(type, page);
        call.enqueue(this);

    }

    @Override
    public void onResponse(Response<Entitys> response, Retrofit retrofit) {
        if(page == 1){
            adapter.clearAll();
        }
        adapter.addAll(response.body().getItems());
        listView.onRefreshComplete();
    }

    @Override
    public void onFailure(Throwable t) {
        Toast.makeText(getContext(),"网络失败",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPullDownToRefresh(PullToRefreshBase refreshView) {
        page = 1;
        QsbkService.getArticleService().getList(type,page).enqueue(this);
    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase refreshView) {
        page++;
        QsbkService.getArticleService().getList(type,page).enqueue(this);
    }

    @Override
    public void onClick(View v) {
        ItemData data = (ItemData) v.getTag();
        Intent intent = new Intent(getContext(), OtherCommentActivity.class);
        intent.putExtra("data",data);
        startActivity(intent);
    }
}
