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
public class XeNoiThanh extends ChuyenXe
{
    private int soTuyen;
    private int soKmDD;

    public XeNoiThanh(int soTuyen, int soKmDD, String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDD = soKmDD;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKmDD() {
        return soKmDD;
    }

    public void setSoKmDD(int soKmDD) {
        this.soKmDD = soKmDD;
    }

    @Override
    public void hienThiTT() {
        super.hienThiTT(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Số tuyến: " + soTuyen);
        System.out.println("Số km đi được: " + soKmDD);
        System.out.println("-------------------------------");
    }
    
    
}
