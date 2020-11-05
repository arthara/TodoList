package com.artharatask.todolist_ads.module.edittask;

import com.artharatask.todolist_ads.base.BaseFragmentHolderActivity;

import static com.artharatask.todolist_ads.utils.Constants.TASK_ID;

public class EditTaskActivity extends BaseFragmentHolderActivity {

    EditTaskFragment editTaskFragment;

    @Override
    protected void initializeFragment() {
        initializeView();

        editTaskFragment = new EditTaskFragment();
        EditTaskPresenter presenter = new EditTaskPresenter(editTaskFragment);
        editTaskFragment.setPresenter(presenter);

        String id = getIntent().getStringExtra(TASK_ID);
        presenter.setId(id);
        setCurrentFragment(editTaskFragment, true);
    }
}
