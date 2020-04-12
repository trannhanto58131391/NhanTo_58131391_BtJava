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
public class SinhVienBiz extends SinhVienPoLy
{
    double diemMaketing, diemSales;

	public SinhVienBiz(String hoTen, String nganh,double diemMaketing, double diemSales) {
		super(hoTen, nganh);
		this.diemMaketing = diemMaketing;
		this.diemSales = diemSales;
	}

	@Override
	double getDiem() {
		return (2*diemMaketing + diemSales)/3;
	}
}
