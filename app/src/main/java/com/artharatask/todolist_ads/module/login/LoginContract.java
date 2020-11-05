package com.artharatask.todolist_ads.module.login;

import com.artharatask.todolist_ads.base.BasePresenter;
import com.artharatask.todolist_ads.base.BaseView;

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToHome();
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String pass);
    }
}
