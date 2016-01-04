package chailei.com.qsbkapp;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import chailei.com.qsbkapp.adapters.OtherCommentAdapter;
import chailei.com.qsbkapp.entity.ItemData;
import chailei.com.qsbkapp.entity.Temp;

public class OtherCommentActivity extends AppCompatActivity {

    private ViewPager pager;
    private TabLayout tab;
    private OtherCommentAdapter adapter;
    private List<Temp> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_comment);

        Intent intent = getIntent();
        ItemData data = (ItemData) intent.getSerializableExtra("data");
        getView(data);

        pager = (ViewPager) findViewById(R.id.comment_view_pager);
        tab = (TabLayout) findViewById(R.id.comment_tab);
        list = new ArrayList<>();

        list.add(new Temp(data.getId(),"全部"));
        list.add(new Temp(data.getId(),"全部"));
        adapter = new OtherCommentAdapter(getSupportFragmentManager(),list);
        pager.setAdapter(adapter);
        tab.setupWithViewPager(pager);
    }
    public void getView(ItemData data){


        SimpleDraweeView item_icon = (SimpleDraweeView)findViewById(R.id.item_icon);
        TextView item_name = (TextView) findViewById(R.id.item_name);
        TextView item_content = (TextView) findViewById(R.id.item_content);
        TextView item_smile = (TextView) findViewById(R.id.item_smile);
        TextView item_comment = (TextView) findViewById(R.id.item_comment);
        TextView item_share = (TextView) findViewById(R.id.item_share);
        SimpleDraweeView item_image = (SimpleDraweeView) findViewById(R.id.item_image);
        RadioButton support = (RadioButton) findViewById(R.id.item_smile_icon);
        RadioButton unSupport = (RadioButton) findViewById(R.id.item_no_smile_icon);
        RadioGroup group = (RadioGroup) findViewById(R.id.item_radio);

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
    }
}
