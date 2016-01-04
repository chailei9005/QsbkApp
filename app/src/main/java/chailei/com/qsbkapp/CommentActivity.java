package chailei.com.qsbkapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import chailei.com.qsbkapp.adapters.CommentAdapter;
import chailei.com.qsbkapp.entity.Entitys;
import chailei.com.qsbkapp.entity.ItemData;
import chailei.com.qsbkapp.entity.QsbkService;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

//设置head的时候一定要有数据源
public class CommentActivity extends AppCompatActivity implements Callback<Entitys>, AdapterView.OnItemClickListener, AbsListView.OnScrollListener {

    private ListView commentListView;
    private List<String>  list;
    private int page = 1;
    private CommentAdapter adapter;
    private int id;
    private boolean isBottom;
    private int mTotalItemCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        commentListView = (ListView) findViewById(R.id.list_view_comment);

        Intent intent = getIntent();
        ItemData data = (ItemData) intent.getSerializableExtra("data");
        adapter = new CommentAdapter(this);
        commentListView.setAdapter(adapter);

//        list = new ArrayList<>();
//        for (int i = 0; i < 50; i++) {
//            list.add("chailei"+i);
//        }
//        commentListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
        id = data.getId();
        Call<Entitys> call = QsbkService.getCommentService().getList(id, page);
        call.enqueue(this);
        View headView =getView(data);
        commentListView.addHeaderView(headView);

        commentListView.setSelection(mTotalItemCount);
        commentListView.setOnItemClickListener(this);
        commentListView.setOnScrollListener(this);
    }




    public View getView(ItemData data){
        View view = LayoutInflater.from(this).inflate(R.layout.item, null);

        SimpleDraweeView item_icon = (SimpleDraweeView)view.findViewById(R.id.item_icon);
        TextView item_name = (TextView) view.findViewById(R.id.item_name);
        TextView item_content = (TextView) view.findViewById(R.id.item_content);
        TextView item_smile = (TextView) view.findViewById(R.id.item_smile);
        TextView item_comment = (TextView) view.findViewById(R.id.item_comment);
        TextView item_share = (TextView) view.findViewById(R.id.item_share);
        SimpleDraweeView item_image = (SimpleDraweeView) view.findViewById(R.id.item_image);
        RadioButton support = (RadioButton) view.findViewById(R.id.item_smile_icon);
        RadioButton unSupport = (RadioButton) view.findViewById(R.id.item_no_smile_icon);
        RadioGroup group = (RadioGroup) view.findViewById(R.id.item_radio);

        if(data.getUser_icon() != null){
            item_icon.setImageURI(Uri.parse(data.getUser_icon()));
        }else{
            item_icon.setImageURI(Uri.parse("res:///" + R.mipmap.ic_launcher));
        }
        if(data.getUser_name() !=null){
            item_name.setText(data.getUser_name());
        }else{
            item_name.setText(data.getUser_name());
        }
        item_content.setText(data.getContent());
        if(data.getImage_url() != null){
            item_image.setImageURI(Uri.parse(data.getImage_url()));
        }else if(data.getPic_url() != null){
            item_image.setImageURI(Uri.parse(data.getPic_url()));
        }else{
            item_image.setVisibility(View.GONE);
        }
        int vote_count = data.getVote_count();
        item_smile.setText("好笑 " + String.valueOf(vote_count));
        int comment_count = data.getComment_count();
        item_comment.setText("评论 " + String.valueOf(comment_count));
        int share_count = data.getShare_count();
        item_share.setText("分享 "+String.valueOf(share_count));
        return view;
    }


    @Override
    public void onResponse(Response<Entitys> response, Retrofit retrofit) {

        adapter.addAll(response.body().getItems());
//        commentListView.setSelection(adapter.getCount());

    }

    @Override
    public void onFailure(Throwable t) {
        t.printStackTrace();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"position="+position,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

        switch (scrollState){
            case SCROLL_STATE_FLING:
                break;
            case SCROLL_STATE_IDLE:
//                mTotalItemCount = commentListView.getFirstVisiblePosition();
                break;
            case SCROLL_STATE_TOUCH_SCROLL:
                if(isBottom){
                    QsbkService.getCommentService().getList(id, ++page).enqueue(this);

                    Toast.makeText(this,"page = "+page,Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        Log.d("listview","firstVisibleItem="+firstVisibleItem);
        Log.d("listview","visibleItemCount="+visibleItemCount);
        Log.d("listview","totalItemCount="+totalItemCount);
        if(totalItemCount<=firstVisibleItem+visibleItemCount){
            isBottom = true;
        }else{
            isBottom = false;
        }
    }
}
