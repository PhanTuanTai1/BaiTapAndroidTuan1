package com.example.student.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FootballPlayer1 extends AppCompatActivity {
    ListView lst;
    ArrayList<FootballPlayer> arr;
    AdapterFootballPlayer adt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football_player1);
        lst = findViewById(R.id.lstView);
        arr = new ArrayList<FootballPlayer>();
        adt = new AdapterFootballPlayer(this,R.layout.my_layout,arr);
        lst.setAdapter(adt);
        FootballPlayer f = new FootballPlayer();
        f.setName("Tai");
        f.setYear(1998);
        f.setNation("VietNam");
        Context c = getApplicationContext();
        f.setIDFace(getResourseId(this,f.getName().toLowerCase(),"drawable",getPackageName()));
        f.setIDNATION(getResourseId(this,f.getNation().toLowerCase(),"drawable",getPackageName()));
        arr.add(f);


    }
    public static int getResourseId(Context context, String pVariableName, String pResourcename, String pPackageName) throws RuntimeException {
        try {
            return context.getResources().getIdentifier(pVariableName, pResourcename, pPackageName);
        } catch (Exception e) {
            throw new RuntimeException("Error getting Resource ID.", e);
        }
    }
}
