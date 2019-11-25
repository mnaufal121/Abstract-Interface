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
public class Lingkaran extends Hitung {

    double r = 14;
    double p = 3.14;

    @Override
    public void getLuas() {
        double L = p * r * r;
        System.out.println("luas lingkaran = " + L);
    }

    @Override
    public void getKeliling() {
        double K = 2 * p * r;
        System.out.println("keliling lingkaran = " + K);
    }
}
