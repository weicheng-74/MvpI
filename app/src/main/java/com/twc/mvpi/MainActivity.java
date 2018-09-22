package com.twc.mvpi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.twc.mvpi.base.BaseMvpActivity;
import com.twc.mvpi.presenter.IMainPresenter;
import com.twc.mvpi.view.IMainView;

public class MainActivity extends BaseMvpActivity<IMainView, IMainPresenter> implements IMainView {
    private TextView msgt;
    private Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = findViewById(R.id.but);
        msgt = findViewById(R.id.msg);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getmPresenter().getIMainMsg("我是请求接口的参数");
            }
        });
    }

    @Override
    protected IMainPresenter createPresenter() {
        return new IMainPresenter();
    }

    @Override
    public void otherMethod() {
        Toast.makeText(this, "我调用了另外的方法", Toast.LENGTH_LONG).show();
    }

    @Override
    public void refreshView(String msg) {
        msgt.setText(msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
