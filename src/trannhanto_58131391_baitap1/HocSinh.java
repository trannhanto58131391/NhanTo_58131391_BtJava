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
public class HocSinh extends CaNhan 
{
    String lop;
    String nangKhieu;

    public HocSinh() {
    }

    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }
    
    @Override
    public String HienThiTT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    public void hienThiTT() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Họ tên sv: " + hoTen + "; Tuổi: " + tuoi + "; Địa chỉ: " + diaChi + "; Sđt: " + sdt + "; Lớp: " + lop + "; Năng khiếu: " + nangKhieu);
    }
    
    
}
