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
public class DauQuangLoc_59131309_LopHoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hocSinh hs1 = new hocSinh("59.CNTT-1","Ghita","Hoàng Văn Nam",21,"Ninh Hòa","25236437");
        hocSinh hs2 = new hocSinh("59.CNTT-2","Múa","Trần Kim Liên",21,"Diên Khánh","53623525");
        
        giaoVien gv1 = new giaoVien("Cơ sở dữ liệu","Thông tin quản lý","Phạm Thị Thu Thúy",40,"Nha Trang","088972549");
        giaoVien gv2 = new giaoVien("Lập trình C/C++","Kĩ thuật phần mềm","Phạm Thị Kim Ngoan",35,"Nha Trang","08825262");
        lopHoc lh = new lopHoc();
        
        lh.themHocSinh(hs1);
        lh.themHocSinh(hs2);
        
        lh.themGiaoVienGD(gv1);
        lh.themGiaoVienGD(gv2);
        
        lh.inDSGVGD();
        lh.inDSHS();
    }
    
}
