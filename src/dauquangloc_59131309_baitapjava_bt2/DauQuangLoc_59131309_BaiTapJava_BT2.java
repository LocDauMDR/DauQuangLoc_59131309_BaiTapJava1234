/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dauquangloc_59131309_baitapjava_bt2;

/**
 *
 * @author quang
 */
public class DauQuangLoc_59131309_BaiTapJava_BT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        
        nhanVien nV1 = new nhanVien("Nguyễn Nam",25,"21 Nguyễn Tất Thành Đăk Lăk",5000000,365);
        nhanVien nV2 = new nhanVien("Nguyễn Hoàng",27,"21 Yersin Đăk Lăk",6000000,200);
        nhanVien nV3 = new nhanVien("Hoàng Luận", 22, "22 Ymoan Đăk lăk", 3230000, 150);
        nhanVien nV4 = new nhanVien("Đức An", 23, "44 M'Drak Đăk Lăk", 3500000, 180);
        nhanVien nV5 = new nhanVien("Hào Văn", 24, "24 BMT Đăk Lăk", 3460000, 100);
        nhanVien nV6 = new nhanVien("Trần Hoàng", 30, "44 Trần Quý Cáp Đăk Lăk", 3467000, 50);
        nhanVien nV7 = new nhanVien("Bùi Hải", 26, "24 KrongPak Đăk Lăk", 3640000, 400);
        
        System.out.println(nV1.getThongTin());
        System.out.println(nV2.getThongTin());
        
        qlnv.them(nV3);
        qlnv.them(nV4);
        qlnv.them(nV5);
        qlnv.them(nV6);
        qlnv.them(nV7);
        
        qlnv.inDS();
    }
    
}
