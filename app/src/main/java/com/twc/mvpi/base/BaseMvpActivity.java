package com.twc.mvpi.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseMvpActivity<V extends MvpView, T extends BasePresenter<V>> extends AppCompatActivity {
    private T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (mPresenter == null) {
            mPresenter = createPresenter();
        }
        if (mPresenter != null && !mPresenter.isViewAttached()) {
            mPresenter.attachView((V) this);
            mPresenter.baseInit(this);
        }
    }

    public T getmPresenter() {
        return mPresenter;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detchView();
        }
    }

    protected abstract T createPresenter();


}
