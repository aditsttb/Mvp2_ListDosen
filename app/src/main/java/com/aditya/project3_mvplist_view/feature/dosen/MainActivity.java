package com.aditya.project3_mvplist_view.feature.dosen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aditya.project3_mvplist_view.R;
import com.aditya.project3_mvplist_view.feature.dosen.DosenAdapater;
import com.aditya.project3_mvplist_view.feature.dosen.DosenContract;
import com.aditya.project3_mvplist_view.feature.dosen.DosenPresenter;
import com.aditya.project3_mvplist_view.model.Dosen;
import com.aditya.project3_mvplist_view.feature.detail.DetailActivity;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements DosenContract.View {



    private DosenAdapater adapater;
    private RecyclerView recyclerView;
    private DosenContract.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new DosenPresenter(this);
        presenter.start();
    }


    @Override
    public void setPresenter(DosenContract.Presenter presenter){
        this.presenter= presenter;
    }

    public void onClick(View view){
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        startActivity(intent);
    }

    @Override
    public void setItemToView(List<Dosen> list){
        recyclerView = findViewById(R.id.recycler_view);
        adapater = new DosenAdapater((ArrayList<Dosen>)list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapater);
    }



}
