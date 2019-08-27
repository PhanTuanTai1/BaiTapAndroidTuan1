package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    EditText txtDuongLich;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txtDuongLich = (EditText) findViewById(R.id.editDuongLich);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }
    public void Convert(View v){
        String can,chi;
        switch (Integer.parseInt(txtDuongLich.getText().toString())%10){

        }
    }
}
