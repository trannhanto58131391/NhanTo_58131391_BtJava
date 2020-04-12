/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author TNT
 */
public class BaiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienIT sv1 = new SinhVienIT("Trần Nhân","CNTT", 7.0, 8.0, 7.0);
        SinhVienBiz sv2 = new SinhVienBiz("Nguyên Phan","Kế Toán", 7.0, 9.0);
	sv1.xuat();
        System.out.println("Điểm TB: " + sv1.getDiem() + " - Học Lực: " + sv1.getHocLuc());
	sv2.xuat();
        System.out.println("Điểm TB: " + sv2.getDiem() + " - Học Lực: " + sv2.getHocLuc());
    }
    
}
