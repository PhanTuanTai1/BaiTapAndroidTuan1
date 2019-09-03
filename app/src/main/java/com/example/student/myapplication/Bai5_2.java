package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;

public class Bai5_2 extends AppCompatActivity {
    EditText tenNV,maNV;
    ListView lstView;
    RadioButton chinhThuc,thoiVu;
    ArrayList<NhanVien> lstNV;
    ArrayAdapter<NhanVien> ApdaterNV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5_2);
        tenNV = findViewById(R.id.editTenNV);
        maNV = findViewById(R.id.editMaNV);
        lstView = findViewById(R.id.lstView);
        chinhThuc = findViewById(R.id.rbChinhThuc);
        thoiVu = findViewById(R.id.rbThoiVu);
        lstNV = new ArrayList<NhanVien>();
        ApdaterNV = new ArrayAdapter<NhanVien>(this,android.R.layout.simple_list_item_1,lstNV);
        lstView.setAdapter(ApdaterNV);
    }
    public void Add(View v){
        if(chinhThuc.isChecked()){
            NhanVien nv = new NhanVienChinhThuc();
            nv.SetID(Integer.parseInt(maNV.getText().toString()));
            nv.SetName(tenNV.getText().toString());
            lstNV.add(nv);
            ApdaterNV.notifyDataSetChanged();
        }
        else {
            NhanVien nv = new NhanVienThoiVu();
            nv.SetID(Integer.parseInt(maNV.getText().toString()));
            nv.SetName(tenNV.getText().toString());
            lstNV.add(nv);
            ApdaterNV.notifyDataSetChanged();
        }
    }
}
