/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dauquangloc_59131309_baitapjava_bt3;

/**
 *
 * @author quang
 */
public class DauQuangLoc_59131309_BaiTapJava_BT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienPoly svIT = new SinhVienIT(8, 9, 10, "Nguyễn Văn Nam", "Công nghệ thông tin");
        SinhVienPoly svBiz = new SinhVienBiz(9, 10, "Hoàng Ngọc Ánh", "Marketing");
        
        svIT.xuat();
        svBiz.xuat();
    }
    
}
