package com.ren.mvp.presenter;

import com.ren.mvp.view.IUserView;
import com.ren.mvp.bean.UserBean;
import com.ren.mvp.model.IUserModel;
import com.ren.mvp.model.UserModel;

/**
 * Presenter:
 * 作为View与Model交互的中间纽带，处理与用户交互的负责逻辑
 *
 * Created by someone on 2017/2/23.
 */

public class UserPresenter {
    private IUserView mUserView;
    private IUserModel mUserModel;

    public UserPresenter(IUserView view) {
        mUserView = view;
        mUserModel = new UserModel();
    }

    public void saveUser(int id, String firstName, String lastName) {
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser(int id) {
        UserBean userBean = mUserModel.load(id);
        mUserView.setFirstName(userBean.getFirstName());
        mUserView.setLastName(userBean.getLastName());
    }

}
