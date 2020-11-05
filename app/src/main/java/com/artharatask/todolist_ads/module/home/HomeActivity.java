package com.artharatask.todolist_ads.module.home;

import android.view.View;

import com.artharatask.todolist_ads.base.BaseFragmentHolderActivity;

public class HomeActivity extends BaseFragmentHolderActivity {

    HomeFragment homeFragment;

    @Override
    protected void initializeFragment() {
        initializeView();

        btnBack.setVisibility(View.GONE);

        homeFragment = new HomeFragment();
        HomePresenter presenter = new HomePresenter(homeFragment);
        homeFragment.setPresenter(presenter);
        setCurrentFragment(homeFragment, false);
    }

}
