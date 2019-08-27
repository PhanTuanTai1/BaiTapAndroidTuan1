package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText editC,editF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editC = findViewById(R.id.editC);
        editF = findViewById(R.id.editF);
    }
    public void Convert(View v){
        switch (v.getId()){
            case R.id.btnCTC:{
                float result = (Float.parseFloat(editF.getText().toString())-32) * 5/9;
                editC.setText(""+result);
                break;
            }
            case R.id.btnCTF:{
                float result = Float.parseFloat(editC.getText().toString()) * 9/5  + 32;
                editF.setText(""+result);
                break;
            }
            default:{
                editC.setText("");
                editF.setText("");
            }
        }
    }

}
