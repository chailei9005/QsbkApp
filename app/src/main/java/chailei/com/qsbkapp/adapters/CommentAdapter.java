package chailei.com.qsbkapp.adapters;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import chailei.com.qsbkapp.R;
import chailei.com.qsbkapp.entity.Entitys;

/**
 * Created by Administrator on 16-1-3.
 */
public class CommentAdapter extends BaseAdapter {
    private List<Entitys.ItemsEntity> list;
    private Context context;

    public CommentAdapter(Context context) {
        this.context = context;
        list = new ArrayList<>();
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
            convertView = LayoutInflater.from(context).inflate(R.layout.comment_item,parent,false);
            convertView.setTag(new ViewHolder(convertView));
        }
        ViewHolder holder = (ViewHolder) convertView.getTag();
        Entitys.ItemsEntity items = list.get(position);

        if(items.getUser() !=null){
            holder.name.setText(items.getUser().getLogin());
            holder.icon.setImageURI(Uri.parse(items.getUser().getIcon()));

        }else{
            holder.name.setText("匿名用户");
            holder.icon.setImageURI(Uri.parse("res:///"+R.mipmap.ic_launcher));
            holder.content.setText("无内容");
        }
        holder.content.setText(items.getContent());

        return convertView;
    }
    public void addAll(Collection<? extends Entitys.ItemsEntity> collection){
        list.addAll(collection);
        notifyDataSetInvalidated();
    }

    public class ViewHolder{

        private final ImageView icon;
        private final TextView name;
        private final TextView index;
        private final TextView content;
        private final TextView time;
        private final TextView zan;

        public ViewHolder(View view){

            icon = (ImageView) view.findViewById(R.id.info_item_icon);
            name = (TextView) view.findViewById(R.id.info_item_name);
            index = (TextView) view.findViewById(R.id.info_item_index);
            content = (TextView) view.findViewById(R.id.info_item_content);
            time = (TextView) view.findViewById(R.id.info_item_time);
            zan = (TextView) view.findViewById(R.id.info_item_zan);
        }
    }

}
