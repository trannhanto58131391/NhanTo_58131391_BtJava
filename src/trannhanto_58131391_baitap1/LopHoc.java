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
public class LopHoc 
{
    QLDS dsHS = new QLDS();
    QLDS dsGV = new QLDS();

    public LopHoc() {
    }
    
    public int themHocSinh(HocSinh hs)
    {
        dsHS.them(hs);
        return 1;
    }
    
    public int themGVGD(GiaoVien gv)
    {
        dsGV.them(gv);
        return 1;
    }
    
    public void inDSHS()
    {
        dsHS.inDS(dsHS.dscanhan);
    }
    
}
