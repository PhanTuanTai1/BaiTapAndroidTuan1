package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnTong,btnTich,btnHieu,btnThuong,btnUCLN,btnExit;
    TextView result;
    EditText numA,numB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.tvResult);
        numA = (EditText) findViewById(R.id.editA);
        numB = (EditText) findViewById(R.id.editB);
    }
    public void Calculate(View v){
        switch (v.getId()){
            case R.id.btnTong:{
                float ketqua = Float.parseFloat(numA.getText().toString()) + Float.parseFloat(numB.getText().toString());
                result.setText(""+ketqua);
                break;
            }
            case R.id.btnHieu:{
                float ketqua = Float.parseFloat(numA.getText().toString()) - Float.parseFloat(numB.getText().toString());
                result.setText(""+ketqua);
                break;
            }
            case R.id.btnTich:{
                float ketqua = Float.parseFloat(numA.getText().toString()) * Float.parseFloat(numB.getText().toString());
                result.setText(""+ketqua);
                break;
            }
            case R.id.btnThuong:{
                float ketqua = Float.parseFloat(numA.getText().toString()) / Float.parseFloat(numB.getText().toString());
                result.setText(""+ketqua);
                break;
            }
            case R.id.btnUCLN:{
                float num1 = Float.parseFloat(numA.getText().toString());
                float num2 = Float.parseFloat(numB.getText().toString());
                float ketqua;
                while (num1*num2 != 0){
                    if (num1 > num2){
                        num1 %= num2;
                    }else{
                        num2 %= num1;
                    }
                }
                ketqua = num1+num2;
                result.setText(""+ketqua);
                break;
            }
            default: finish();
        }
    }
}
