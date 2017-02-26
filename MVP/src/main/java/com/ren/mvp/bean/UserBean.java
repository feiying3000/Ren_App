package com.ren.mvp.bean;

/**
 * Bean，代表数据实体
 *
 * Created by someone on 2017/2/23.
 */

public class UserBean {
    private String firstName;
    private String lastName;

    public UserBean(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
