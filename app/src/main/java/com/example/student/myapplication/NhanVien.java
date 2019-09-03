package com.example.student.myapplication;

public abstract  class NhanVien {
    protected int maNV;
    protected String tenNV;
    public abstract double TinhLuong();
    public void SetID(int id){
        this.maNV = id;
    }
    public void SetName(String name){
        this.tenNV = name;
    }
    public int GetID(){
        return this.maNV;
    }
    public String GetName(){
        return this.tenNV;
    }
}
