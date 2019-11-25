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
public class Driver {

    public static void main(String[] args) {

        Lingkaran p = new Lingkaran();
        System.out.println("Lingkaran");
        p.getLuas();
        p.getKeliling();

        Persegi s = new Persegi();
        System.out.println("Persegi");
        s.getLuas();
        s.getKeliling();
    }
}
