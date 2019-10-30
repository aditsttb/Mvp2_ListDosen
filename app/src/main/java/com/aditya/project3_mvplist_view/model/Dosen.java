package com.aditya.project3_mvplist_view.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Dosen implements Parcelable {
    private String nama;
    private String nid;
    private String nohp;


    public Dosen (String nama, String nid, String nohp){
        this.nama = nama;
        this.nid = nid;
        this.nohp = nohp;
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.nid);
        dest.writeString(this.nohp);
    }

    protected Dosen(Parcel in) {
        this.nama = in.readString();
        this.nid = in.readString();
        this.nohp = in.readString();
    }

    public static final Parcelable.Creator<Dosen> CREATOR = new Parcelable.Creator<Dosen>() {
        @Override
        public Dosen createFromParcel(Parcel source) {
            return new Dosen(source);
        }

        @Override
        public Dosen[] newArray(int size) {
            return new Dosen[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }


}
