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
    caNhan giaoVienCN;
    QLDS qldsGVGD;
    QLDS qldsHS;

    public lopHoc() {
        qldsGVGD = new QLDS();
        qldsHS = new QLDS();
        giaoVienCN = new giaoVien();
    }

    public lopHoc(caNhan giaoVIenCN, QLDS qldsGVGD, QLDS qldsHS) {
        this.giaoVienCN = giaoVIenCN;
        this.qldsGVGD = qldsGVGD;
        this.qldsHS = qldsHS;
    }

    public caNhan getGiaoVIenCN() {
        return giaoVienCN;
    }

    public void setGiaoVIenCN(caNhan giaoVIenCN) {
        this.giaoVienCN = giaoVIenCN;
    }

    public QLDS getQldsGVGD() {
        return qldsGVGD;
    }

    public void setQldsGVGD(QLDS qldsGVGD) {
        this.qldsGVGD = qldsGVGD;
    }

    public QLDS getQldsHS() {
        return qldsHS;
    }

    public void setQldsHS(QLDS qldsHS) {
        this.qldsHS = qldsHS;
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
