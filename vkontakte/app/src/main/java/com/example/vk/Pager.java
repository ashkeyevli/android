package com.example.vk;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class Pager extends FragmentPagerAdapter {
    private List<Fragment> fragmentsLIst;

    public Pager(FragmentManager fm, List<Fragment> fragmentsLIst){
        super(fm);
        this.fragmentsLIst=fragmentsLIst;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentsLIst.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsLIst.size();
    }
}
