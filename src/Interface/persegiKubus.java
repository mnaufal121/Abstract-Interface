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
public class persegiKubus implements BangunRuang {
    double s = 4;
    
    @Override
    public double getVolume() {
        double V = s*s*s;
        System.out.println("Volume kubus = "+V+" cm kubik");
        return V;
    }

    @Override
    public double getLuas() {
        double L = 4*s;
        System.out.println("Luas persegi = "+L+" cm persegi");
        return L;
    }
}
