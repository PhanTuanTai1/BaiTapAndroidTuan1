package com.example.student.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterFootballPlayer extends ArrayAdapter<FootballPlayer> {
    Activity context = null;
    ArrayList<FootballPlayer> myArray = null;
    int layoutID;

    public AdapterFootballPlayer(Activity context, int textViewResourceID,ArrayList<FootballPlayer> objects) {
        super(context,textViewResourceID,objects);
        this.context = context;
        this.myArray = objects;
        this.layoutID = textViewResourceID;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(layoutID,null);

        if(myArray.size() > 0 && position >= 0){
            final ImageView imgFace = convertView.findViewById(R.id.imgFace);
            final ImageView nation = convertView.findViewById(R.id.imgNation);
            final TextView editInfor = convertView.findViewById(R.id.editInfor);
            final FootballPlayer fb = myArray.get(position);
            imgFace.setImageResource(fb.getIDFace());
            nation.setImageResource(fb.getIDNATION());
            editInfor.setText(fb.toString());
        }
        return convertView;
    }
}
