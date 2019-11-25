/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Asus
 */
public class persegiBalok implements BangunRuang{
    double p = 4, l = 2, t = 3;
    
    @Override
    public double getVolume() {
        double V = p*l*t;
        System.out.println("Volume kubus = "+V+" cm kubik");
        return V;
    }

    @Override
    public double getLuas() {
        double L = p*l;
        System.out.println("Luas persegi = "+L+" cm persegi");
        return L;
    }
}
