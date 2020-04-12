/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trannhanto_58131391_baitap1;

/**
 *
 * @author TNT
 */
public class TranNhanTo_58131391_BaiTap1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LopHoc lh = new LopHoc();
        
        HocSinh hs1 = new HocSinh("58TH1","Chơi đàn","Trần Nhân",22,"Ninh Hòa","0364079123");
        HocSinh hs2 = new HocSinh("58TH1","Chơi cờ","Hải Lê",22,"Ninh Hà","0364079125");
        GiaoVien gv1 = new GiaoVien("Công nghệ XML","CNTT","Trần Đức",39,"Nha Trang","0365728199");
        GiaoVien gv2 = new GiaoVien("CSDL","CNTT","Nguyễn Thúy",49,"Nha Trang","0369928199");
        
        lh.themHocSinh(hs1);
        lh.themHocSinh(hs2);
        lh.themGVGD(gv1);
        lh.themGVGD(gv2);

        lh.inDSHS();
    }
    
}