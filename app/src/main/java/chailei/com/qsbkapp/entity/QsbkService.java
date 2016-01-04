package chailei.com.qsbkapp.entity;

import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Administrator on 16-1-2.
 */
public class QsbkService {
    private static Retrofit build;
    static {
        build = new Retrofit.Builder().baseUrl("http://m2.qiushibaike.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public interface ArticleService{
        @GET("article/list/{type}")
        Call<Entitys> getList(@Path("type") String type, @Query("page") int page);
    }

    public interface CommentService{
        @GET("article/{id}/comments")
        Call<Entitys> getList(@Path("id") int id,@Query("page") int page);

    }
    public static ArticleService getArticleService(){
            return build.create(ArticleService.class);
    }
    public static CommentService getCommentService(){
        return build.create(CommentService.class);
    }


}
