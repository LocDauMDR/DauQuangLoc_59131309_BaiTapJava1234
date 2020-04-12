/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dauquangloc_59131309_lophoc;

import java.util.ArrayList;

/**
 *
 * @author quang
 */
public class QLDS implements IQLDS{
    ArrayList<caNhan> ds;

    public QLDS() {
        ds = new ArrayList();
    }

    public QLDS(ArrayList<caNhan> ds) {
        this.ds = ds;
    }

    public ArrayList<caNhan> getDs() {
        return ds;
    }

    public void setDs(ArrayList<caNhan> ds) {
        this.ds = ds;
    }

    

    @Override
    public int them(caNhan p) {
        if(ds.add(p))
            return 1;
        return 0;
    }

    @Override
    public int xoa(String ten) {
        int dst = 0;
        for(int i = 0; i < ds.size(); i++){
            if(ds.get(i).getHoTen().equals(ten)){
                ds.remove(i);
                dst = 1;
            }
        }
        return dst;
    }

    @Override
    public void inDS() {
        int ds = this.ds.size();
        for(int i=0; i<ds; i++){
            this.ds.get(i).hienThiTT();
        }

    }
   
}
