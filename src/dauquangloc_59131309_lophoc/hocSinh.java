/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dauquangloc_59131309_lophoc;

/**
 *
 * @author quang
 */
public class hocSinh extends caNhan{
    private String lop;
    private String nangKhieu;
    
    public hocSinh(){}

    public hocSinh(String lop, String nangKhieu) {
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String hienThiTT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
