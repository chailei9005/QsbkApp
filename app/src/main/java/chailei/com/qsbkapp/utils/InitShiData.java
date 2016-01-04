package chailei.com.qsbkapp.utils;

import java.util.ArrayList;
import java.util.List;

import chailei.com.qsbkapp.entity.ArticleType;

/**
 * Created by Administrator on 16-1-2.
 */
public class InitShiData {

    private static  List<ArticleType> list = new ArrayList<>();


    static  {
        list = new ArrayList<>();
        list.add(new ArticleType("suggest","专享"));
        list.add(new ArticleType("video","视频"));
        list.add(new ArticleType("text","纯文"));
        list.add(new ArticleType("image","纯图"));
        list.add(new ArticleType("latest","精华"));
    }
    public static List<ArticleType> getList(){
        return list;
    }
}
