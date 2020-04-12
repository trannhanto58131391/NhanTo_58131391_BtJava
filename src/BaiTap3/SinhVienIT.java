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
public class SinhVienIT extends SinhVienPoLy
{
    double diemJava, diemHtml, diemCss;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemHtml, double diemCss) 
    {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    @Override
    double getDiem() {
        return (2*diemJava + diemHtml + diemCss)/4;
    }

    


}
