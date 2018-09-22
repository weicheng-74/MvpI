package com.twc.mvpi.model;

import com.twc.mvpi.presenter.OnDataListener;

public class IModelImp implements IModelInterface {
    OnDataListener iMainPresenter;

    public IModelImp(OnDataListener iMainPresenter) {
        this.iMainPresenter = iMainPresenter;
    }

    @Override
    public void getDataFormNet(String msg) {
        iMainPresenter.getData(msg + "，我通过参数从网络获取的数据");
    }
}
