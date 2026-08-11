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
        List<KhoaHoc> dsKhoaHoc = new ArrayList<>();
        try{
            KhoaHocTuHoc th1 = new KhoaHocTuHoc(1,
                "Tu hoc",
                "com ga chien",
                800,
                2
        );
            th1.setSoThangDK(-1);
            dsKhoaHoc.add(th1);
        } catch(IllegalArgumentException e){
            System.out.println("Loi: " + e.getMessage());
        }

        try {
            KhoaHocMentor mt1 = new KhoaHocMentor(
                2,
                "Mentor",
                "My cay",
                900,
                5,
                200
        );
            mt1.setSoBuoiMentor(10);
            dsKhoaHoc.add(mt1);
        } catch(IllegalArgumentException e){
            System.out.println("Loi: " + e.getMessage());
        }

        try{
            KhoaHocDoanhNghiep dn2 = new KhoaHocDoanhNghiep(
                3,
                "Doanh nghiep",
                "Sua tuoi",
                1000,
                12,
                2
        );
            dn2.setMucChietKhau(-1000);
            dsKhoaHoc.add(dn2);
        } catch(IllegalArgumentException e){
            System.out.println("Loi: " + e.getMessage());
        }

        for(int i=0;i<dsKhoaHoc.size();i++){
            dsKhoaHoc.get(i).hienThi();
        }
        System.out.println("--------------------------------");
        Collections.sort(dsKhoaHoc, new  Comparator<KhoaHoc>() {
            public int compare(KhoaHoc o1, KhoaHoc o2) {
                return Double.compare(
                        o1.tinhHocPhi(),
                        o2.tinhHocPhi());
            }
        });
        for(int i=0;i<dsKhoaHoc.size();i++){
            System.out.println(dsKhoaHoc.get(i).toString());
        }
    }
}
