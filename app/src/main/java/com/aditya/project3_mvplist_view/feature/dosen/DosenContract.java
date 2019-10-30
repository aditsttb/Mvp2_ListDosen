package com.aditya.project3_mvplist_view.feature.dosen;

import com.aditya.project3_mvplist_view.base.BasePresenter;
import com.aditya.project3_mvplist_view.base.BaseView;
import com.aditya.project3_mvplist_view.model.Dosen;

import java.util.List;

public class DosenContract {
    public interface View extends BaseView<Presenter>{
        void setItemToView(List<Dosen>list);

    }
    public interface Presenter extends BasePresenter{
        void loadData();
    }
}
