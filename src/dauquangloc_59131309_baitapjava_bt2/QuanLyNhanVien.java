/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dauquangloc_59131309_baitapjava_bt2;

import java.util.ArrayList;

/**
 *
 * @author quang
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<nhanVien> dsNhanVien;

    public QuanLyNhanVien() {
        dsNhanVien = new ArrayList();
    }

    @Override
    public void them(nhanVien nv) {
        dsNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
