/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;
import java.util.ArrayList;
/**
 *
 * @author TNT
 */
public class QuanLyChuyenXe 
{
    ArrayList<ChuyenXe> ds = new ArrayList();

    public QuanLyChuyenXe() {
    }
    
    public void themCX(ChuyenXe cx)
    {
        this.ds.add(cx);
    }
    
    public void xuatDS()
    {
        for(int i = 0; i < ds.size(); i++){
            ds.get(i).hienThiTT();
        }
    }
    
    public void tongDTNoiThanh()
    {
        double tong = 0;
        for(int i=0;i<ds.size(); i++){
            if(ds.get(i)  instanceof XeNoiThanh){
                tong += ds.get(i).getDoanhThu();
            }
        }
        System.out.println("Tổng doanh thu xe nội thành: " + tong);
    }
    
    public void tongDTNgoaiThanh()
    {
        double tong = 0;
        for(int i=0;i<ds.size(); i++){
            if(ds.get(i)  instanceof XeNgoaiThanh){
                tong += ds.get(i).getDoanhThu();
            }
        }
        System.out.println("Tổng doanh thu xe ngoại thành: " + tong);
    }
    
    public void tongDT2LoaiXe()
    {
        double tong = 0;
        for(int i=0;i<ds.size(); i++){
            tong += ds.get(i).getDoanhThu();
        }
        System.out.println("Tổng doanh thu của cả 2 loại xe: " + tong);
    }
}
