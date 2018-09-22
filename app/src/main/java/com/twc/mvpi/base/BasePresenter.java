package com.twc.mvpi.base;

import android.content.Context;

public abstract class BasePresenter<V extends MvpView> implements Presenter<V> {
    private V mMvpView;
    private Context context;

    public abstract void init(Context context);

    public void baseInit(Context context) {
        this.context = context;
        init(context);
    }

    public Context getContext() {
        return context;
    }

    public V getmMvpView() {
        return mMvpView;
    }

    @Override
    public void attachView(V mvpView) {
        this.mMvpView = mvpView;
    }

    @Override
    public void detchView() {
        this.mMvpView = null;
    }

    public boolean isViewAttached() {
        return mMvpView != null;
    }
}
