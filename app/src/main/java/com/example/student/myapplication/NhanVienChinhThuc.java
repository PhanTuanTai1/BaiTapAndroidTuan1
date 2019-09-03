package com.example.student.myapplication;

public class NhanVienChinhThuc extends  NhanVien{
    @Override
    public double TinhLuong() {
        return 500;
    }

    @Override
    public String toString() {
        return this.maNV + "-" + this.tenNV + "--> " + "Full Time = " + this.TinhLuong();
    }
}
