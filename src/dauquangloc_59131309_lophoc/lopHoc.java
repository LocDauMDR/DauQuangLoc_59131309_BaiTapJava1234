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
public class lopHoc {
    caNhan giaoVIenCN;
    QLDS qldsGVGD;
    QLDS qldsHS;

    public lopHoc() {}

    public caNhan getGiaoVIenCN() {
        return giaoVIenCN;
    }

    public void setGiaoVIenCN(caNhan giaoVIenCN) {
        this.giaoVIenCN = giaoVIenCN;
    }

    public int themHocSinh(hocSinh hs){
        return qldsHS.them(hs);
    }
    public int themGiaoVienGD(giaoVien gv){
       return qldsGVGD.them(gv);
    }
    public int inDSHS(){
        qldsHS.inDS();
        return 0;
    }
    public int inDSGVGD(){
        
        qldsGVGD.inDS();
        return 0;
    }
    
}
