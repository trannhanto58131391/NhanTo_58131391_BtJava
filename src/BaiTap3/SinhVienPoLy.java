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
public abstract class SinhVienPoLy 
{
    String hoTen;
    String nganh;

    public SinhVienPoLy(String hoTen, String nganh) {
	this.hoTen = hoTen;
	this.nganh = nganh;
    }

    public String getHoTen() {
            return this.hoTen;
    }
    
    public String getNganh() {
            return this.nganh;
    }

    abstract double getDiem();

    String getHocLuc() {
	if (this.getDiem() < 5) {
            return "Yeu";
	} 
        else if (this.getDiem() >= 5 && this.getDiem() < 6.5) {
			return "Trung bình";
		} 
        else if (this.getDiem() >= 6.5 && this.getDiem() < 7.5) {
			return "Khá";
		} 
        else if (this.getDiem() >= 7.5 && this.getDiem() < 9) {
			return "Giỏi";
		} 
        else {
			return "Xuất sắc";
		}
	}

	void xuat() {
		System.out.println(this.getHoTen()+ " - " + this.getNganh());
	}
}
