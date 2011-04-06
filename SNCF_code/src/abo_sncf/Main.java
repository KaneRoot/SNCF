/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abo_sncf;

import SNCF.*;

/**
 *
 * @author kane
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Jeu de test public 
        TestSNCF t = new TestSNCF();
        t.initJeuEssai();
        t.listerGares();
        t.listerAbos();
        t.reconduireX(3);
        t.descAboX(3);
        t.descAboNom("Bob");
        t.distanceGareNom("str");
        t.nbTotalAbo();
        t.modifParams(20, 40, 4, "year", "month");
        t.listerAbos();
        t.newGareD("mul", 60);
        t.listerGares();
        t.newAboM("max",12,"mul");
        t.newAboA("Sue", "31/09/09","str");
        t.nbTotalAbo();
        t.listerAbos();
        t.reconduireX(6);
        t.descAboX(6);      
        t.quitter();
    }

    

}
