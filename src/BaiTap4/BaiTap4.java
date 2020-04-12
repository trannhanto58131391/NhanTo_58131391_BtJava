/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author TNT
 */
public class BaiTap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        
        XeNoiThanh xeNT1 = new XeNoiThanh(123789, 1200, "NT0001", "Nguyễn Hải", "KB08261", 1500000);
        XeNoiThanh xeNT2 = new XeNoiThanh(123789, 2000, "NT0002", "Trần Đức", "KB08261", 1000000);
        XeNgoaiThanh xeNgT1 = new XeNgoaiThanh("Nha Trang", 24, "NT0004", "Nguyễn Thu", "KB05261", 2200000);
        XeNgoaiThanh xeNgT2 = new XeNgoaiThanh("Tháp Bà", 14, "NT0007", "Tô Nhan", "KB08265", 2500000);
        
        qlcx.themCX(xeNT1);
        qlcx.themCX(xeNT2);
        qlcx.themCX(xeNgT1);
        qlcx.themCX(xeNgT2);
        
        qlcx.xuatDS();
        qlcx.tongDTNoiThanh();
        qlcx.tongDTNgoaiThanh();
        qlcx.tongDT2LoaiXe();
    }
    
}
