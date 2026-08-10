package qlkhoahoc;

public class KhoaHocMentor extends KhoaHoc {
    private int soBuoiMentor;
    private double phiMoiBuoiMentor;

    public KhoaHocMentor() {
        int soBuoiMentor = 0;
        double phiMoiBuoiMentor = 0;
    }

    public KhoaHocMentor(int maKhoaHoc, String tenKhoaHoc, String tenGiangVien, long hocPhiCoBan, int soBuoiMentor, double phiMoiBuoiMentor) {
        super(maKhoaHoc, tenKhoaHoc, tenGiangVien, hocPhiCoBan);
        this.soBuoiMentor = soBuoiMentor;
        this.phiMoiBuoiMentor = phiMoiBuoiMentor;
    }

    public int getSoBuoiMentor() {
        return soBuoiMentor;
    }

    public void setSoBuoiMentor(int soBuoiMentor){
        if (soBuoiMentor <= 0) {
            throw new IllegalArgumentException("So buoi mentor phai > 0");
        }
        this.soBuoiMentor = soBuoiMentor;
    }

    public double getPhiMoiBuoiMentor() {
        return phiMoiBuoiMentor;
    }

    public void setPhiMoiBuoiMentor(double phiMoiBuoiMentor){
        if (phiMoiBuoiMentor <= 0) {
            throw new IllegalArgumentException("Phi moi buoi mentor phai > 0");
        }
        this.phiMoiBuoiMentor = phiMoiBuoiMentor;
    }

    @Override
    public double tinhHocPhi() {
        return getHocPhiCoBan() + soBuoiMentor * phiMoiBuoiMentor;
    }

    @Override
    public void hienThi() {
        System.out.println("-----------KHOA HOC MENTOR----------");
        super.hienThi();
        System.out.println("So buoi mentor: " + soBuoiMentor);
        System.out.println("Phi moi buoi mentor: " + phiMoiBuoiMentor);
        System.out.println("Tong hoc phi: " + tinhHocPhi());
    }

    @Override
    public String toString() {
        return "[" + getMaKhoaHoc() + "] " + getTenKhoaHoc() + " - Hoc Phi: " + tinhHocPhi() + " vnd.(Khoa hoc mentor)";
    }
}
