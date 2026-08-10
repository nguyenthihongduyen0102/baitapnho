package demo;

import qlkhoahoc.KhoaHoc;
import qlkhoahoc.KhoaHocDoanhNghiep;
import qlkhoahoc.KhoaHocMentor;
import qlkhoahoc.KhoaHocTuHoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        KhoaHocTuHoc th1 = new KhoaHocTuHoc(1,
                "Tu hoc",
                "com ga chien",
                800,
                2
        );
        KhoaHocMentor mt1 = new KhoaHocMentor(
                2,
                "Mentor",
                "My cay",
                900,
                5,
                200
        );
        KhoaHocDoanhNghiep dn2 = new KhoaHocDoanhNghiep(
                3,
                "Doanh nghiep",
                "Sua tuoi",
                1000,
                12,
                2
        );
        KhoaHocTuHoc th2 = new KhoaHocTuHoc(
                4,
                "Thu Vien",
                "Bun cha",
                400,
                2
        );
        List<KhoaHoc> dsKhoaHoc = new ArrayList<>();
        dsKhoaHoc.add(th1);
        dsKhoaHoc.add(mt1);
        dsKhoaHoc.add(dn2);
        dsKhoaHoc.add(th2);
//        try{
//            th1.setSoThangDK(-1);
//        } catch(IllegalArgumentException e){
//            System.out.println("Da nhap sai thong tin");
//        }
//
//        try {
//            mt1.setSoBuoiMentor(0);
//        } catch(IllegalArgumentException e){
//            System.out.println("Da nhap sai thong tin");
//        }
//
//        try{
//            dn2.setMucChietKhau(-1);
//        } catch(IllegalArgumentException e){
//            System.out.println("Da nhap sai thong tin");
//        }
        for(int i=0;i<dsKhoaHoc.size();i++){
            dsKhoaHoc.get(i).hienThi();
        }
        Comparator<KhoaHoc> tonghocphi = new Comparator<KhoaHoc>() {
            public int compare(KhoaHoc k1, KhoaHoc k2) {
                return Double.compare(k1.tinhHocPhi(), k2.tinhHocPhi());
            }
        };
        Collections.sort(dsKhoaHoc, tonghocphi);
        System.out.println("--------------------------------");
        for(int i=0;i<dsKhoaHoc.size();i++){
            System.out.println(dsKhoaHoc.get(i).toString());
        }
    }
}
