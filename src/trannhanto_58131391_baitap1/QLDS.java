/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trannhanto_58131391_baitap1;

import java.util.ArrayList;

/**
 *
 * @author TNT
 */
public class QLDS implements IQLDS
{
    ArrayList<CaNhan> dscanhan = new ArrayList<>();

    public QLDS() {
    }
    
    
    
    public QLDS(ArrayList<CaNhan> dscanhan) 
    {
        this.dscanhan = dscanhan;
    }
    
    
    @Override
    public int them(CaNhan p) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        dscanhan.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i =0; i<dscanhan.size(); i++){
            if (dscanhan.get(i).getHoTen() == ten)
                dscanhan.remove(i);
        }
        return 1;
    }

    @Override
    public void inDS(ArrayList<CaNhan> list) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i =0; i<list.size(); i++){
            list.get(i).hienThiTT();
        }
    }
    
}
