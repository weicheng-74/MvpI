package com.twc.mvpi.presenter;

import android.content.Context;

import com.twc.mvpi.base.BasePresenter;
import com.twc.mvpi.model.IModelImp;
import com.twc.mvpi.view.IMainView;

public class IMainPresenter extends BasePresenter<IMainView> implements OnDataListener {
    private IModelImp iModelImp;

    @Override
    public void init(Context context) {
        iModelImp = new IModelImp(this);
    }

    public void getIMainMsg(String but_is_but) {
        iModelImp.getDataFormNet(but_is_but);
    }

    @Override
    public void getData(String msg) {
        getmMvpView().otherMethod();
        getmMvpView().refreshView(msg);
    }
}
