/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author TNT
 */
public class BaiTap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<NhanVien> dsnv = new ArrayList();
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        
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
        
        dsnv.add(nv1);
        dsnv.add(nv2);
        
        qlnv.inDS(dsnv);
    }
    
}
