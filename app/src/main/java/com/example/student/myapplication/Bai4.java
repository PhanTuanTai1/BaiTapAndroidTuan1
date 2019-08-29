package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Bai4 extends AppCompatActivity {

    EditText editName,editCMND,editTTBS;
    RadioButton cbTrungCap,cbCaoDang,cbDaiHoc;
    CheckBox cbDocSach,cbDocBao,cbDocCode;
    TextView tvBangCap,tvSoThich;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        editName = (EditText)findViewById(R.id.editName);
        editCMND = (EditText)findViewById(R.id.editCMND);
        editTTBS = (EditText)findViewById(R.id.editTTBS);
        cbTrungCap = (RadioButton)findViewById(R.id.cbTrungCap);
        cbCaoDang = (RadioButton)findViewById(R.id.cbCaoDang);
        cbDaiHoc = (RadioButton)findViewById(R.id.cbDaiHoc);
        cbDocSach = (CheckBox) findViewById(R.id.cbDocSach);
        cbDocBao = (CheckBox)findViewById(R.id.cbDocBao);
        cbDocCode = (CheckBox)findViewById(R.id.cbDocCode);
        tvBangCap = (TextView)findViewById(R.id.tvBangCap);
        tvSoThich = (TextView)findViewById(R.id.tvSoThich);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
    }
    public void GuiThongTin(View v){
        String name = editName.getText().toString();
        String cmnd = editCMND.getText().toString();
        if(name.length() == 0) {
            editName.requestFocus();
            editName.setError("Tên không được bỏ trống");
        }
        else {
            editName.setError(null);
        }
        if(!name.matches("^\\D{3,}$")){
            editName.requestFocus();
            editName.setError("Tên phải có từ 3 ký tự trở lên");
        }
        else {
            editName.setError(null);
        }
        if(cmnd.length() == 0){
            editCMND.requestFocus();
            editCMND.setError("Chứng minh nhân dân không được bỏ trống");
        }
        else {
            editCMND.setError(null);
        }
        if(!cmnd.matches("^\\d{9}$")){
            editCMND.requestFocus();
            editCMND.setError("Chứng minh nhân dân tối đa là 9 chữ số");
        }
        else {
            editCMND.setError(null);
        }
        if(!cbTrungCap.isChecked() && !cbCaoDang.isChecked() && !cbDaiHoc.isChecked()){
            cbDaiHoc.requestFocus();
            cbDaiHoc.setError("Vui lòng chọn loại bằng cấp");
        }
        if(!cbDocSach.isChecked() && !cbDocCode.isChecked() && !cbDocBao.isChecked()){
            tvSoThich.requestFocus();
            tvSoThich.setError("Vui lòng chọn ít nhất một sở thích");
        }
        else {
            tvSoThich.setError(null);
        }
    }
}
