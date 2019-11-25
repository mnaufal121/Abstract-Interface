/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Asus
 */
public class Persegi extends Hitung {
    double p = 3;
    double l = 2;
    
    @Override
    public void getLuas(){
     double L = p*l;
        System.out.println("Luas persegi = "+L);
    }
    @Override
    public void getKeliling(){
     double K = 2*(p+l);
        System.out.println("Keliling persegi "+K);
    }
}
