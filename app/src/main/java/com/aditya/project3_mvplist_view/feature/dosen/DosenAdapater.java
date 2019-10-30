package com.aditya.project3_mvplist_view.feature.dosen;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import com.aditya.project3_mvplist_view.R;
import com.aditya.project3_mvplist_view.feature.detail.DetailActivity;
import com.aditya.project3_mvplist_view.model.Dosen;
import java.util.ArrayList;

public class DosenAdapater extends RecyclerView.Adapter <DosenAdapater.DosenViewHolder> {

    private ArrayList<Dosen>dataList;

    public DosenAdapater(ArrayList<Dosen>dataList){
        this.dataList = dataList;
    }


    @Override
    public  DosenViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_dosen, parent, false);
        return new DosenViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final DosenViewHolder holder, final int position){

        holder.txtNid.setText(dataList.get(position).getNama());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNid.setText(dataList.get(position).getNid());
        holder.txtNoHp.setText(dataList.get(position).getNohp());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View itemView = holder.itemView;
                    Toast.makeText(itemView.getContext(),"Halaman Berpindah",Toast.LENGTH_LONG).show();

                Intent myIntent = new Intent(itemView.getContext(), DetailActivity.class);
                myIntent.putExtra("DATA_DOSEN", dataList.get(position));
                itemView.getContext().startActivity(myIntent);
            }
        });
    }

    @Override
    public int getItemCount(){
    return  (dataList !=null)? dataList.size():0;
    }

        public class DosenViewHolder extends RecyclerView.ViewHolder {
            private TextView txtNama, txtNid, txtNoHp;

            public DosenViewHolder (final View itemView){
                super(itemView);
                txtNama=(TextView) itemView.findViewById(R.id.txt_nama_dosen);
                txtNid=(TextView) itemView.findViewById(R.id.txt_nid_dosen);
                txtNoHp=(TextView) itemView.findViewById(R.id.txt_nohp_dosen);
            }

        }
    }
