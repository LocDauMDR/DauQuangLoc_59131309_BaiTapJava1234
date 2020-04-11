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
        nhanVien nV1 = new nhanVien("Nguyễn Nam",25,"21 Nguyễn Tất Thành Đăk Lăk",5000000,365);
        nhanVien nV2 = new nhanVien("Nguyễn Hoàng",27,"21 Yersin Đăk Lăk",6000000,400);
        nhanVien nV3 = new nhanVien();
        System.out.println(nV1.getThongTin());
        System.out.println(nV2.getThongTin());
        System.out.println(nV3.getThongTin());
    }
    
}
