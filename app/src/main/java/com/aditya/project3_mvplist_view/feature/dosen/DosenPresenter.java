package com.aditya.project3_mvplist_view.feature.dosen;

import com.aditya.project3_mvplist_view.model.Dosen;

import java.util.ArrayList;

public class DosenPresenter implements DosenContract.Presenter {

    public DosenContract.View view;

    public DosenPresenter(DosenContract.View view){
    this.view = view;
    this.view.setPresenter(this);
    }

    @Override
    public void start(){
        loadData();
    }

    @Override
    public void loadData(){

        ArrayList<Dosen> dosenArrayList;

        dosenArrayList = new ArrayList<>();
        dosenArrayList.add(new Dosen("Nama  : Agus Nurjaman, Mpd.", "NID : Ds_001", "08987181123"));
        dosenArrayList.add(new Dosen("Nama : Marsijan , M.Kom", "NID : Ds_002", "08231142244"));
        dosenArrayList.add(new Dosen("Nama : Angga Putra, S.Kom, CCNA,.","NID : DS_003","081324567897"));
        dosenArrayList.add(new Dosen("Nama : Andri Romdoni, S.Kom, Orc,.","NID: DS_004","083422125675"));
        view.setItemToView(dosenArrayList);
    }

}
