package chailei.com.qsbkapp.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 16-1-3.
 */
public class ItemData implements Serializable{

    private int id;
    private String user_name;
    private String user_icon;
    private String content;
    private String image_url;
    private String pic_url;
    private int vote_count;
    private int comment_count;
    private int share_count;

    public ItemData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_icon() {
        return user_icon;
    }

    public void setUser_icon(String user_icon) {
        this.user_icon = user_icon;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public int getShare_count() {
        return share_count;
    }

    public void setShare_count(int share_count) {
        this.share_count = share_count;
    }

    @Override
    public String toString() {
        return "ItemData{" +
                "user_name='" + user_name + '\'' +
                ", user_icon='" + user_icon + '\'' +
                ", content='" + content + '\'' +
                ", image_url='" + image_url + '\'' +
                ", pic_url='" + pic_url + '\'' +
                ", vote_count=" + vote_count +
                ", comment_count=" + comment_count +
                ", share_count=" + share_count +
                '}';
    }
}
