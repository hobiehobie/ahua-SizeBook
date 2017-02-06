package com.example.amy.sizebook;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Amy on 2017-02-04.
 */




public class Record implements Parcelable{

    String name;
    String neck;
    String bust;
    String chest;
    String waist;
    String hip;
    String inseam;
    String comment;
    String date;


    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(name);
        out.writeString(neck);
        out.writeString(bust);
        out.writeString(chest);
        out.writeString(waist);
        out.writeString(hip);
        out.writeString(inseam);
        out.writeString(date);
    }

    public static final Parcelable.Creator<Record> CREATOR = new Parcelable.Creator<Record>() {
        public Record createFromParcel(Parcel in) {
            return new Record();
        }

        public Record[] newArray(int size) {
            return new Record[size];
        }

    };

    /*protected void onCreate(ArrayList<String> inputarray){
        name = inputarray.get(1);
        neck = inputarray.get(2);
        bust = inputarray.get(3);
        chest = inputarray.get(4);
        waist = inputarray.get(5);
        hip = inputarray.get(6);
        inseam = inputarray.get(7);
        comment = inputarray.get(8);
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    public void setBust(String bust) {
        this.bust = bust;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }

    public void setWaist(String waist) {
        this.waist = waist;
    }

    public void setHip(String hip) {
        this.hip = hip;
    }

    public void setInseam(String inseam) {
        this.inseam = inseam;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
