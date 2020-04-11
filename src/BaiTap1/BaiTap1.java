/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author TNT
 */
public class BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //nhân viên 1
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Trần Nhân Tố");
        nv1.setTuoi(22);
        nv1.setDiaChi("Ninh Hòa,Khánh Hòa");
        nv1.setTienLuong(100000);
        nv1.setTongGioLam(250);
        //nhân viên 2
        NhanVien nv2 = new NhanVien();
        nv2.setTen("Nguyễn Văn Đại");
        nv2.setTuoi(25);
        nv2.setDiaChi("12 Lang Liêu, Vĩnh Phước, Nha Trang");
        nv2.setTienLuong(150000);
        nv2.setTongGioLam(100);
        //in thông tin của nhân viên
        System.out.println(nv1.getThongTin()+" Số Tiền Thưởng: "+nv1.tinhThuong());
        System.out.println(nv2.getThongTin()+" Số Tiền Thưởng: "+nv2.tinhThuong());
        
    }
    
}
