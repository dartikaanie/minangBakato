package com.example.minangbakato.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Kamus implements Parcelable {
    private String keyword;
    private String arti;

    public Kamus(String keyword, String arti) {
        this.keyword = keyword;
        this.arti =arti;
    }


    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getArti() {
        return arti;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.keyword);
        dest.writeString(this.arti);
    }

    public Kamus() {
    }

    protected Kamus(Parcel in) {
        this.keyword = in.readString();
        this.arti = in.readString();
    }

    public static final Parcelable.Creator<Kamus> CREATOR = new Parcelable.Creator<Kamus>() {
        @Override
        public Kamus createFromParcel(Parcel source) {
            return new Kamus(source);
        }

        @Override
        public Kamus[] newArray(int size) {
            return new Kamus[size];
        }
    };
}
