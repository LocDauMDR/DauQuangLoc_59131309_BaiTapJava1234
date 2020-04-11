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
    private string lop;
    private string nangKhieu;
    
    public hocSinh(){}

    public hocSinh(string lop, string nangKhieu) {
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public string getLop() {
        return lop;
    }

    public void setLop(string lop) {
        this.lop = lop;
    }

    public string getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(string nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    
    
}
