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
public class lingkaranBola implements BangunRuang, Bola{
    double pi = 3.14;
    double r = 14;
    public double jari2;
    
    @Override
    public void setjari2(double jari2){
        this.jari2 = jari2;
    }
    
    @Override
    public double getjari2(){
        return jari2;
    }
    
    @Override
    public double getVolume() {
        setjari2(r);
        double V = 4/3*pi*r*r*r;
        System.out.println("Volume bola = "+V+" cm kubik");
        return V;
    }

    @Override
    public double getLuas() {
        setjari2(r);
        double L = pi*r*r;
        System.out.println("Luas persegi = "+L+" cm persegi");
        return L;
    }
}
