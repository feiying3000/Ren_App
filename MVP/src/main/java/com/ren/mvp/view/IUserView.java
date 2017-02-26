package com.ren.mvp.view;

/**
 * View interface:需要View实现的接口，
 * View通过View interface与Presenter进行交互，降低耦合，方便进行单元测试
 */
public interface IUserView {
    int getID();
    String getFirstName();
    String getLastName();
    void setFirstName(String firstName);
    void setLastName(String lastName);
}
