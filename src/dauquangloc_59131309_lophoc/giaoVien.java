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
public abstract class giaoVien extends caNhan{
    private string monDay;
    private string toBoMon;

    public giaoVien() {}
    
    public giaoVien(string monDay, string toBoMon, string hoTen, int tuoi, string diaChi, string sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public string getMonDay() {
        return monDay;
    }

    public void setMonDay(string monDay) {
        this.monDay = monDay;
    }

    public string getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(string toBoMon) {
        this.toBoMon = toBoMon;
    }
    
    
}
