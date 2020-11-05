package com.artharatask.todolist_ads.module.home;

import com.artharatask.todolist_ads.base.BasePresenter;
import com.artharatask.todolist_ads.base.BaseView;
import com.artharatask.todolist_ads.data.model.Task;

import java.util.List;

public interface HomeContract {
    interface View extends BaseView<Presenter> {
        void sendToAddTask();

        void sendToEditTask(String id);
    }

    interface Presenter extends BasePresenter {
        void addTask();

        void editTask(String id);

        List<Task> getTasks();
    }
}
