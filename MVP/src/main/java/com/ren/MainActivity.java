package com.ren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ren.mvp.view.UserActivity;
import com.ren.ren_mvp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setView();
    }

    private void setView() {
        Button btnMVP_test = (Button) findViewById(R.id.btnMVP_test);
        btnMVP_test.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent itn = new Intent(MainActivity.this, UserActivity.class);
                startActivity(itn);
            }
        });
    }
}
