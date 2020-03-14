package com.example.vk;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterFeed.FragmentLikeListener, AdapterLike.FragmentLikeListener, AdapterFeed.FragmentButtonListener {
Fragment f1= new FragementFeed();
Fragment f2=new FragmentLike();
private ViewPager pager;
private PagerAdapter pagerAdapter;
List<Fragment> list = new ArrayList<>();
BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottom_nav);
        list.add(f1);
        list.add(f2);
        pager= findViewById(R.id.pager);
        pagerAdapter= new Pager(getSupportFragmentManager(), list);
        pager.setAdapter(pagerAdapter);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.feed:
                        pager.setCurrentItem(0,false);
                        break;
                    case R.id.like:
                        pager.setCurrentItem(1,false);
                        break;
                }

                return false;
            }
        });

        }

        @Override
        public void myClick(ModelFeed modelFeed, int option){
        Fragment fragment= getSupportFragmentManager().findFragmentById(R.id.pager);
        if(option==1)
            ((FragmentLike)fragment).saveNews(modelFeed);
        else
            ((FragmentLike)fragment).removeNews(modelFeed);
        }



    @Override
    public void removeItemLike(ModelFeed modelFeed) {
        ((FragementFeed)f1).removeLike(modelFeed);
        ((FragmentLike)f2).removeLike(modelFeed);
    }



}
