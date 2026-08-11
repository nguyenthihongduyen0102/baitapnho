package qlkhoahoc;

import java.util.Comparator;

public abstract class KhoaHoc implements IKhoaHoc{
    private int maKhoaHoc;
    private String tenKhoaHoc;
    private String tenGiangVien;
    private long hocPhiCoBan;

    public KhoaHoc(){
        int maKhoaHoc = 0;
        String tenKhoaHoc = "";
        String tenGiangVien = "";
        long hocPhiCoBan = 0;
    }

    public KhoaHoc(int maKhoaHoc, String tenKhoaHoc, String tenGiangVien, long hocPhiCoBan) {
        this.maKhoaHoc = maKhoaHoc;
        this.tenKhoaHoc = tenKhoaHoc;
        this.tenGiangVien = tenGiangVien;
        this.hocPhiCoBan = hocPhiCoBan;
    }

    public int getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(int maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public long getHocPhiCoBan() {
        return hocPhiCoBan;
    }

    public void setHocPhiCoBan(long hocPhiCoBan){
        if (hocPhiCoBan < 0){
            throw new IllegalArgumentException("Hoc phi co ban phai >= 0");
        }
        this.hocPhiCoBan = hocPhiCoBan;
    }
    @Override
    public void hienThi() {
        System.out.println("Ma Khoa Hoc: " + maKhoaHoc);
        System.out.println("Ten Khoa Hoc: " + tenKhoaHoc);
        System.out.println("Ten Giang Vien: " + tenGiangVien);
        System.out.println("Hoc Phi Co Ban: " + hocPhiCoBan);
    }
    @Override
    public abstract double tinhHocPhi();

    @Override
    public String toString() {
        return "[" + maKhoaHoc + "] " + tenKhoaHoc + " - Hoc Phi: " + tinhHocPhi() + " vnd." ;
    }

//    public int compareTo(IKhoaHoc o) {
//        return Double.compare(this.tinhHocPhi(), o.tinhHocPhi());
//    }
}
