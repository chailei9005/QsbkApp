package chailei.com.qsbkapp.CustomView;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by Administrator on 16-1-3.
 */
public class MyListView extends ListView {
    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyListView(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int height =MeasureSpec.makeMeasureSpec(
                Integer.MAX_VALUE>>2,
                MeasureSpec.AT_MOST
        );
//        Log.d("listview","height"+height);
        super.onMeasure(widthMeasureSpec,height);
//        setMeasuredDimension(widthMeasureSpec, height);
    }
}
