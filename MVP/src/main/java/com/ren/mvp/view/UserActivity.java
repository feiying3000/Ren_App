package com.ren.mvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ren.mvp.presenter.UserPresenter;
import com.ren.ren_mvp.R;

public class UserActivity extends Activity implements IUserView {
    private EditText edtFirstName,edtLastName,edtId;
    private UserPresenter userPresenter; // 将复杂业务逻辑从IUserView提取到IUserModel处理

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        setView();
        userPresenter = new UserPresenter(this);
    }

    public void setSave(View v) {
        userPresenter.saveUser(getID(), getFirstName(), getLastName());
    }

    public void setLoad(View v) {
        userPresenter.loadUser(getID());
    }

    private void setView() {
        edtFirstName = (EditText)findViewById(R.id.edtFristName);
        edtLastName = (EditText) findViewById(R.id.edtLastName);
        edtId = (EditText) findViewById(R.id.edtId);
    }

    @Override
    public int getID() {
        return Integer.parseInt(edtId.getText().toString());
    }

    @Override
    public String getFirstName() {
        return edtFirstName.getText().toString();
    }

    @Override
    public String getLastName() {
        return edtLastName.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        edtFirstName.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        edtLastName.setText(lastName);
    }
}
