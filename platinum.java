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
public class platinum extends gold { //Menggunakan Extends karena PlatinumMember merupakan subclass dari class gold
    private int biaya;
    long pulsa;
    double diskon = 0.03;
    int cashback =10000;
    
    @Override
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
        poin = 10 * lama;
        System.out.println("Jumlah Poin : " + poin);
    }
    
    @Override
    //getter
    public int getCashback(){
        return this.cashback;
    }
    
    protected void Benefit4(long lama){
        pulsa = 5000 * lama;
        System.out.println("Bonus Pulsa : " + pulsa);
    }
}

