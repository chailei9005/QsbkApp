package chailei.com.qsbkapp.adapters;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import chailei.com.qsbkapp.R;
import chailei.com.qsbkapp.entity.Entitys;
import chailei.com.qsbkapp.entity.ItemData;

/**
 * Created by Administrator on 16-1-2.
 */
public class ShiInfoAdapter extends BaseAdapter implements RadioGroup.OnCheckedChangeListener {
    private Context context;
    private List<Entitys.ItemsEntity> list;

    public View.OnClickListener onClickListener;

    public ShiInfoAdapter(Context context) {
        this.context = context;
        list = new ArrayList<>();//初始化list集合  一开始是空集合   等网络加载成功之后再添加数据

    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
            Log.d("parent",""+parent);
            convertView.setTag(new ViewHolder(convertView));
        }
        ViewHolder holder = (ViewHolder) convertView.getTag();
        Entitys.ItemsEntity items = list.get(position);
        ItemData data = new ItemData();
        data.setId(items.getId());
        if(items.getUser() !=null){
            String user_name = items.getUser().getLogin();
            holder.item_name.setText(user_name);
            data.setUser_name(user_name);
            String user_icon = items.getUser().getIcon();
            holder.item_icon.setImageURI(Uri.parse(user_icon));
            data.setUser_icon(user_icon);
        }else{
            holder.item_name.setText("匿名用户");
            holder.item_icon.setImageURI(Uri.parse("res:///"+R.mipmap.default_anonymous_users_avatar));
        }
        String content = items.getContent();
        data.setContent(content);
        holder.item_content.setText(content);
        if(items.getImage() != null){
            holder.item_image.setVisibility(View.VISIBLE);
            String imageUrl = items.getImageUrl();
            holder.item_image.setImageURI(Uri.parse(imageUrl));
            data.setImage_url(imageUrl);
            List<Integer> s = items.getImage_size().getS();
            Log.d("image","image");
            holder.item_image.setAspectRatio(1.0f * s.get(0)/s.get(1));
        }else if(items.getPic_url()!=null){
            holder.item_image.setVisibility(View.VISIBLE);
            String pic_url = items.getPic_url();
            holder.item_image.setImageURI(Uri.parse(pic_url));
            data.setPic_url(pic_url);
            holder.item_image.setAspectRatio(1);
        }else{
            holder.item_image.setVisibility(View.GONE);
        }
        holder.group.setOnCheckedChangeListener(this);

        int vote_count = items.getVotes().getUp();
        data.setVote_count(vote_count);
        holder.item_smile.setText("好笑 " + String.valueOf(vote_count));
        int comment_count = items.getComments_count();
        data.setComment_count(comment_count);
        holder.item_comment.setText("评论 " + String.valueOf(comment_count));
        int share_count = items.getShare_count();
        data.setShare_count(share_count);
        holder.item_share.setText("分享 "+String.valueOf(share_count));
        holder.linear.setTag(data);
        holder.linear.setOnClickListener(onClickListener);
        return convertView;
    }
    public  void addAll(Collection<? extends Entitys.ItemsEntity> collection){
        list.addAll(collection);
        notifyDataSetChanged();
    }
    public void clearAll(){
        list.clear();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

    }

    public static class ViewHolder{

        private final SimpleDraweeView item_icon;
        private final TextView item_name;
        private final TextView item_content;
        private final TextView item_smile;
        private final TextView item_comment;
        private final TextView item_share;
        private final SimpleDraweeView item_image;
        private final RadioButton support;
        private final RadioButton unSupport;
        private final RadioGroup group;
        private final LinearLayout linear;

        public ViewHolder(View view){

            item_icon = (SimpleDraweeView)view.findViewById(R.id.item_icon);
            item_name = (TextView) view.findViewById(R.id.item_name);
            item_content = (TextView) view.findViewById(R.id.item_content);
            item_smile = (TextView) view.findViewById(R.id.item_smile);
            item_comment = (TextView) view.findViewById(R.id.item_comment);
            item_share = (TextView) view.findViewById(R.id.item_share);
            item_image = (SimpleDraweeView) view.findViewById(R.id.item_image);

            linear = (LinearLayout) view.findViewById(R.id.item_linear);

            support = (RadioButton) view.findViewById(R.id.item_smile_icon);
            unSupport = (RadioButton) view.findViewById(R.id.item_no_smile_icon);
            group = (RadioGroup) view.findViewById(R.id.item_radio);

        }
    }

}
