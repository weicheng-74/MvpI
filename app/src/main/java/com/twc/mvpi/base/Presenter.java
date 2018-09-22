package com.twc.mvpi.base;

public interface Presenter<V extends MvpView> {
    /**
     * 关联
     */
    void attachView(V mvpView);

    /**
     * 取消关联
     */
    void detchView();

}
