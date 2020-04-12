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
public class QuanLyNhanVien implements IQuanLy
{
    ArrayList<NhanVien> dsnv = new ArrayList();

    public QuanLyNhanVien() {
    }
    
    
    
    @Override
    public void them(NhanVien nv) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        dsnv.add(nv);
    }

    @Override
    public void inDS(ArrayList<NhanVien> dsnv) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(int i = 0; i< dsnv.size(); i++){
            System.out.println("Tên nhân viên: " + dsnv.get(i).getTen());
            System.out.println("Địa chỉ nhân viên: " + dsnv.get(i).getDiaChi());
            System.out.println("Tiền lương nhân viên: " + dsnv.get(i).getTienLuong());
            System.out.println("Tuổi nhân viên: " + dsnv.get(i).getTuoi());
            System.out.println("Tổng số giờ làm nhân viên: " + dsnv.get(i).getTongGioLam());
            System.out.println("-------------------------------------------------------------");
      }
    }
    
}
