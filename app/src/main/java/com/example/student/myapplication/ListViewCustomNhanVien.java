package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;

public class ListViewCustomNhanVien extends AppCompatActivity {
    EditText editTen,editMa;
    RadioButton rbNam,rbNu;
    ListView listViewNV;
    ArrayList<Employee> lstNV;
    AdapterEmployee adt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_custom_nhan_vien);
        editTen = findViewById(R.id.editTenNV);
        editMa = findViewById(R.id.editMaNV);
        listViewNV = findViewById(R.id.lstNV);
        rbNam = findViewById(R.id.rbNam);
        rbNu = findViewById(R.id.rbNu);
        lstNV = new ArrayList<>();
        adt = new AdapterEmployee(this,R.layout.my_layout_1,lstNV);
        listViewNV.setAdapter(adt);
    }
    public void AddEmployee(View v){
        Employee emp = new Employee();
        emp.setMaNV(editMa.getText().toString());
        emp.setTenNV(editTen.getText().toString());
        if(rbNu.isChecked()){
            emp.setGioiTinh(false);
        }
        else emp.setGioiTinh(true);
        lstNV.add(emp);
        adt.notifyDataSetChanged();
    }
    public void DeleteEmployee(View v){
        for(int i = listViewNV.getChildCount() - 1; i >= 0;i--){
            v = listViewNV.getChildAt(i);
            CheckBox check = v.findViewById(R.id.checkIteam);
            if(check.isChecked()){
                lstNV.remove(i);
            }
        }
        adt.notifyDataSetChanged();
    }
    public void AddDemo(){
        Employee emp = new Employee();
        emp.setMaNV("123");
        emp.setTenNV("Tai");
        emp.setGioiTinh(true);

        lstNV.add(emp);
        adt.notifyDataSetChanged();
    }
}
