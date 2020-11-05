package com.artharatask.todolist_ads.module.addtask;

import com.artharatask.todolist_ads.base.BasePresenter;
import com.artharatask.todolist_ads.base.BaseView;

public interface AddTaskContract {
    interface View extends BaseView<Presenter> {
        void redirectToTaskList();
    }

    interface Presenter extends BasePresenter {
        void saveData(String name, String time);
    }
}
