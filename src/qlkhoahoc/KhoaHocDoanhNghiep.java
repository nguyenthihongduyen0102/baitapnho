package qlkhoahoc;

public class KhoaHocDoanhNghiep extends KhoaHoc {
    private int soLuongNV;
    private double mucChietKhau;

    public KhoaHocDoanhNghiep() {
        int soLuongNV = 0;
        double mucChietKhau = 0;
    }

    public KhoaHocDoanhNghiep(int maKhoaHoc, String tenKhoaHoc, String tenGiangVien, long hocPhiCoBan, int soLuongNV, double mucChietKhau) {
        super(maKhoaHoc, tenKhoaHoc, tenGiangVien, hocPhiCoBan);
        this.soLuongNV = soLuongNV;
        this.mucChietKhau = mucChietKhau;
    }

    public int getSoLuongNV() {
        return soLuongNV;
    }

    public void setSoLuongNV(int soLuongNV){
        if(soLuongNV < 1){
            throw new IllegalArgumentException("So luong nhan vien phai >= 1");
        }
        this.soLuongNV = soLuongNV;
    }

    public double getMucChietKhau() {
        return mucChietKhau;
    }

    public void setMucChietKhau(double mucChietKhau){
        if(mucChietKhau<0 || mucChietKhau>100){
            throw new  IllegalArgumentException("Muc chiet khau khong hop le!!!");
        }
        this.mucChietKhau = mucChietKhau;
    }

    @Override
    public double tinhHocPhi() {
        return getHocPhiCoBan() * soLuongNV * (1-mucChietKhau/100);
    }

    @Override
    public void hienThi() {
        System.out.println("----------KHOA HOC DOANH NGHIEP---------");
        super.hienThi();
        System.out.println("So luong nhan vien: " + soLuongNV);
        System.out.println("Muc chiet khau: " + mucChietKhau);
        System.out.println("Tong hoc phi: " + tinhHocPhi());
    }

    @Override
    public String toString() {
        return "[" + getMaKhoaHoc() + "] " + getTenKhoaHoc() + " - Hoc Phi: " + tinhHocPhi() + " vnd. (Khoa hoc doanh nghiep)";
    }
}
