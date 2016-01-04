package chailei.com.qsbkapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import chailei.com.qsbkapp.entity.Temp;
import chailei.com.qsbkapp.fragments.OtherCommentFragment;

/**
 * Created by Administrator on 16-1-3.
 */
public class OtherCommentAdapter extends FragmentPagerAdapter {
    private List<Temp> list;

    public OtherCommentAdapter(FragmentManager fm, List<Temp> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return OtherCommentFragment.newInstance(list.get(position).getId());
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position).getTitle();
    }
}
