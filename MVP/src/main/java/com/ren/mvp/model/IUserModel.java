package com.ren.mvp.model;

import com.ren.mvp.bean.UserBean;

/**
 * 模型接口 降低耦合
 * Created by someone on 2017/2/23.
 */

public interface IUserModel {
    void setID(int id);
    void setFirstName(String firstName);
    void setLastName(String lastName);
    UserBean load(int id);
}
