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

    public hocSinh() {
    }

    public hocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
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
        return "hocSinh{"+ "HoTen = "+ getHoTen()+ "Tuoi = "+ getTuoi()+"DiaChi = "+ getDiaChi()+"SDT = "+ getSdt() + "Lop=" + lop + ", NangKhieu=" + nangKhieu + '}';
    }
    
}
