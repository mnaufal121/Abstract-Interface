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
public class Driver {
    public static void main(String[] args) {
       
        
        persegiBalok p = new persegiBalok();
        p.getVolume();
        p.getLuas();
        System.out.println("");
        
        persegiKubus s = new persegiKubus();
        s.getVolume();
        s.getLuas();
        System.out.println("");
        
        lingkaranBola r = new lingkaranBola();
        r.getVolume();
        r.getLuas();
    }
}
