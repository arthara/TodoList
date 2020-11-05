package com.artharatask.todolist_ads.module.edittask;

import com.artharatask.todolist_ads.base.BasePresenter;
import com.artharatask.todolist_ads.base.BaseView;
import com.artharatask.todolist_ads.data.model.Task;

public interface EditTaskContract {
    interface View extends BaseView<Presenter> {
        void redirectToTaskList();

        void showData(Task task);
    }

    interface Presenter extends BasePresenter {
        void saveData(String name, String time);

        void loadData(String id);

        void setId(String id);

        void deleteData();
    }
}
