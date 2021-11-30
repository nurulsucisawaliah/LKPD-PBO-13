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
public class silver {
    private long biaya = 25000;
    double diskon = 0.01;
    long poin;
    
    public void setBiaya(long biaya){
        if(biaya >0){
            this.biaya = biaya;
        }else{
            this.biaya =0;
        }
    }
    
    protected void Benefit1(long lama){ //Access Modifier: Protected
        double biayaSewa = biaya * lama;
        double total = biayaSewa - (biayaSewa * diskon);
        System.out.println("Total Sewa  : " + total);
    }
    
    protected void Benefit2(long lama){ //Access Modifier: Protected
        poin = 1 * lama;
        System.out.println("Jumlah Poin : " + poin);
    }
}
