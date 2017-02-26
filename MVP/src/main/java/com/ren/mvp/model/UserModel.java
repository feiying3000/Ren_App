package com.ren.mvp.model;

import android.util.SparseArray;

import com.ren.mvp.bean.UserBean;

/**
 * 模型，
 * 负责存储、检索、操纵数据
 * (有时也实现一个Model interface用来降低耦合)
 *
 * Created by someone on 2017/2/23.
 */

public class UserModel implements IUserModel {
    private String firstName;
    private String lastName;
    private int id;
    private SparseArray<UserBean> userArray = new SparseArray<UserBean>();

    @Override
    public void setID(int id) {
        this.id = id;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
        UserBean userBean = new UserBean(firstName, this.lastName);
        userArray.append(id, userBean);
    }

    @Override
    public UserBean load(int id) {
        this.id = id;
        UserBean userBean = userArray.get(this.id, new UserBean("not found", "not found"));
        return userBean;
    }
}
