/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dauquangloc_59131309_baitapjava_bt1;

/**
 *
 * @author quang
 */
public class DauQuangLoc_59131309_BaiTapJava_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nhanVien nV1 = new nhanVien("Nguyễn Nam",25,"21 Nguyễn Tất Thành Đăk Lăk",5000000,365);
        nhanVien nV2 = new nhanVien("Nguyễn Hoàng",27,"21 Yersin Đăk Lăk",6000000,400);
        System.out.println(nV1.getThongTin());
        System.out.println(nV2.getThongTin());
    }
    
}
