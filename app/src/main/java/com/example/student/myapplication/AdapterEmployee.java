package com.example.student.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class AdapterEmployee extends ArrayAdapter<Employee> {
    Activity context = null;
    ArrayList<Employee> arr = null;
    int layoutID;


    public AdapterEmployee(Activity context,int textViewResourceId,ArrayList<Employee> objects) {
        super(context,textViewResourceId, objects);
        this.context = context;
        arr = objects;
        layoutID = textViewResourceId;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(layoutID,null);
        if(arr.size() > 0 && position >= 0){
            TextView tv = convertView.findViewById(R.id.tvContent);
            Employee emp = arr.get(position);
            if(emp.isGioiTinh()) {
                tv.setText(emp.toString());
                tv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.man,0,0,0);
            }
            else {
                tv.setText(emp.toString());
                tv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.girl,0,0,0);
            }
        }
        return convertView;
    }
}
