package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class Main3Activity extends AppCompatActivity {
    EditText txtDuongLich;
    TextView tvResult;
    private HashMap MapChi = new HashMap();
    private HashMap MapCan = new HashMap();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txtDuongLich = (EditText) findViewById(R.id.editDuongLich);
        tvResult = (TextView) findViewById(R.id.textResult);
        createCanAndChi();
    }
    public void Convert(View v){
        //String can,chi;
        int nam = Integer.parseInt(txtDuongLich.getText().toString());
        String can = (String)MapCan.get(nam%10);
        String chi = (String)MapChi.get(nam%12);
        tvResult.setText(can + " " + chi);
    }
    public void createCanAndChi(){
        MapCan.put(0,"Canh");
        MapCan.put(1,"Tân");
        MapCan.put(2,"Nhâm");
        MapCan.put(3,"Qúy");
        MapCan.put(4,"Giáp");
        MapCan.put(5,"Ất");
        MapCan.put(6,"Bính");
        MapCan.put(7,"Đinh");
        MapCan.put(8,"Mậu");
        MapCan.put(9,"Kỷ");
        //----
        MapChi.put(0,"Thân");
        MapChi.put(1,"Dậu");
        MapChi.put(2,"Tuất");
        MapChi.put(3,"Hợi");
        MapChi.put(4,"Tý");
        MapChi.put(5,"Sửu");
        MapChi.put(6,"Dần");
        MapChi.put(7,"Mẹo");
        MapChi.put(8,"Thìn");
        MapChi.put(9,"Tỵ");
        MapChi.put(10,"Ngọ");
        MapChi.put(11,"Mùi");
    }
}
