package chailei.com.qsbkapp.entity;

/**
 * Created by Administrator on 16-1-3.
 */
public class Temp {
    private int id;
    private String title;

    public Temp() {
    }

    public Temp(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
