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
public abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    public SinhVienPoly() {}

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc(){
        double diem = getDiem();
        if(diem<5)
            return("Yếu");
        else if(diem>=5 && diem <6.5)
            return("Trung bình");
        else if(diem>=6.5 && diem <7.5)
            return("Khá");
        else if(diem>=7.5 && diem < 9)
            return("Giỏi");
        else
            return("Xuất sắc");
    }

    public void xuat() {
        System.out.println("SinhVienPoly{" + "HoTen = " + hoTen + ", Nganh = " + nganh + ", Diem = " + getDiem() + ", HocLuc = " + getHocLuc() +'}');
    }
}
