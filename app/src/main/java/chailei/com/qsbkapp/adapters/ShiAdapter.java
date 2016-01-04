package chailei.com.qsbkapp.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import chailei.com.qsbkapp.entity.ArticleType;
import chailei.com.qsbkapp.fragments.ShiInfoFragment;

/**
 * Created by Administrator on 16-1-2.
 */
public class ShiAdapter extends FragmentPagerAdapter {

    private List<ArticleType> list;

    public ShiAdapter(FragmentManager fm, List<ArticleType> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return ShiInfoFragment.newInstance(list.get(position).getType());
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
