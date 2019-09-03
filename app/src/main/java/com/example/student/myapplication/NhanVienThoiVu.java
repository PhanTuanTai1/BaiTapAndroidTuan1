package com.example.student.myapplication;

public class NhanVienThoiVu  extends  NhanVien{

    @Override
    public double TinhLuong() {
        return 150;
    }

    @Override
    public String toString() {
        return this.maNV + "-" + this.tenNV + "--> " + "Part Time = " + this.TinhLuong();
    }
}
