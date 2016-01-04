package chailei.com.qsbkapp;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import chailei.com.qsbkapp.utils.InitFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private ActionBarDrawerToggle toggle;
    private NavigationView navigation ;
    private DrawerLayout drawer;
    private InitFragment initFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer = (DrawerLayout) findViewById(R.id.drawer);
        navigation = (NavigationView) findViewById(R.id.navigation);
        toggle = new ActionBarDrawerToggle(this,drawer,0,0);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toggle.syncState();
        drawer.setDrawerListener(toggle);
        navigation.setNavigationItemSelectedListener(this);
        initFragment = new InitFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container,initFragment.getQiuShiFragment());
        transaction.commit();
    }

    //actionbar navigation关联
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        switch (id){
            case R.id.item_qiushi:
                transaction.replace(R.id.container,initFragment.getQiuShiFragment());
                break;
            case R.id.item_qiuyou:
                transaction.replace(R.id.container,initFragment.getQiuYouFragment());
                break;
            case R.id.item_find:
                transaction.replace(R.id.container,initFragment.getFindFragment());
                break;
            case R.id.item_message:
                transaction.replace(R.id.container,initFragment.getMessageFragment());
                break;
        }
        transaction.commit();
        drawer.closeDrawers();
        return true;
    }
}
