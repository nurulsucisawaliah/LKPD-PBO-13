/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package improvedprojectrentalgames;

/**
 *
 * @author ASUS
 */
public class gold extends silver {
    private int biaya;
    private int cashback = 5000;
    double diskon = 0.02;
    
    public void setBiaya(int biaya){
        if(biaya >0){
            this.biaya = biaya;
        }else{
            this.biaya =0;
        }
    }
    @Override
    protected void Benefit1(long lama){ //Access Modifier: Protected
        double biayaSewa = biaya * lama;
        double total = biayaSewa - (biayaSewa * diskon);
        System.out.println("Total Sewa  : " + total);
    }
    
    @Override
    protected void Benefit2(long lama){ //Access Modifier: Protected
        poin = 5 * lama;
        System.out.println("Jumlah Poin : " + poin);
    }
    //getter
    public int getCashback(){
        return this.cashback;
    }
    
}
