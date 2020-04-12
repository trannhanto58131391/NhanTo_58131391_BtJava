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
public class GiaoVien extends CaNhan
{
    String monDay;
    String toBoMon;

    public GiaoVien() {
    }

    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }
    
    @Override
    public String HienThiTT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public void hienThiTT() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Họ tên gv: " + hoTen + "; Tuổi: " + tuoi + "; Địa chỉ: " + diaChi + "; Sđt: " + sdt + "; Môn giảng dạy: " + monDay + "; Tổ bộ môn: " + toBoMon);
    }
    
    
}
