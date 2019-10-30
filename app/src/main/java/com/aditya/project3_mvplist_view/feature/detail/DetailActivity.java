package com.aditya.project3_mvplist_view.feature.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.aditya.project3_mvplist_view.R;
import com.aditya.project3_mvplist_view.model.Dosen;

public class DetailActivity extends AppCompatActivity {

    Dosen dosen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        dosen = getIntent().getParcelableExtra("DATA_DOSEN");

        TextView nama = findViewById(R.id.tx_nama_tampil);
        TextView nid = findViewById(R.id.tx_nid_tampil);
        TextView nomor = findViewById(R.id.tx_no_tampil);

        nama.setText(dosen.getNama());
        nid.setText(dosen.getNid());
        nomor.setText(dosen.getNohp());
    }
}
