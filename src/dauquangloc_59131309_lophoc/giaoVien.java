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
public class giaoVien extends caNhan{
    private String monDay;
    private String toBoMon;

    public giaoVien() {}
    
    public giaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String hienThiTT() {
        return "giaoVien{"+ "HoTen = "+ getHoTen()+ "Tuoi = "+ getTuoi()+"DiaChi = "+ getDiaChi()+"SDT = "+ getSdt() + "monDay=" + monDay + ", toBoMon=" + toBoMon + '}';
    }

}
