package qlkhoahoc;

public class KhoaHocTuHoc extends KhoaHoc {
    private int soThangDK;

    public KhoaHocTuHoc() {
        int soThangDK = 0;
    }

    public KhoaHocTuHoc(int maKhoaHoc, String tenKhoaHoc, String tenGiangVien, long hocPhiCoBan, int soThangDK) {
        super(maKhoaHoc, tenKhoaHoc, tenGiangVien, hocPhiCoBan);
        this.soThangDK = soThangDK;
    }

    public int getSoThangDK(){
        return soThangDK;
    }
    public void setSoThangDK(int soThangDK){
        if (soThangDK < 1) {
            throw new IllegalArgumentException("So thang dang ky phai >= 1");
        }
        this.soThangDK = soThangDK;
    }

    @Override
    public double tinhHocPhi() {
        return getHocPhiCoBan() * soThangDK;
    }
    @Override
    public void hienThi() {
        System.out.println("---------KHOA HOC TU HOC-------");
        super.hienThi();
        System.out.println("So Thang Dang Ky: " + soThangDK);
        System.out.println("Tong hoc phi: " +  tinhHocPhi());
    }
    @Override
    public String toString() {
        return "[" + getMaKhoaHoc() + "] " + getTenKhoaHoc() + " - Hoc Phi: " + tinhHocPhi() + " vnd.(Khoa hoc tu hoc)";
    }
}
