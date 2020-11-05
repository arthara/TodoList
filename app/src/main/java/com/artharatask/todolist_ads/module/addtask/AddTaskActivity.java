package com.artharatask.todolist_ads.module.addtask;

import com.artharatask.todolist_ads.base.BaseFragmentHolderActivity;

public class AddTaskActivity extends BaseFragmentHolderActivity {

    AddTaskFragment addTaskFragment;

    @Override
    protected void initializeFragment() {
        initializeView();

        addTaskFragment = new AddTaskFragment();
        AddTaskPresenter presenter = new AddTaskPresenter(addTaskFragment);
        addTaskFragment.setPresenter(presenter);

        setCurrentFragment(addTaskFragment, true);
    }
}
