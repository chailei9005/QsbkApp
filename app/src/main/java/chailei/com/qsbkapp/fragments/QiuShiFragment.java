package chailei.com.qsbkapp.fragments;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import chailei.com.qsbkapp.R;
import chailei.com.qsbkapp.adapters.ShiAdapter;
import chailei.com.qsbkapp.utils.InitShiData;

/**
 * A simple {@link Fragment} subclass.
 */
public class QiuShiFragment extends Fragment {

    private ViewPager pager;
    private TabLayout tab;
    private ShiAdapter adapter;
    public QiuShiFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_qiu_shi, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pager = (ViewPager) view.findViewById(R.id.pager);
        tab  = (TabLayout) view.findViewById(R.id.tab);
        adapter = new ShiAdapter(getChildFragmentManager(), InitShiData.getList());
        pager.setAdapter(adapter);
        tab.setupWithViewPager(pager);

    }
}
