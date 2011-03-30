/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abo_sncf;

/**
 *
 * @author kane
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TestSNCF t = new TestSNCF();
        t.initJeuEssai();
        t.listerGares();
        t.listerAbos();
        t.nbTotalAbo();
        t.modifParams(30, 10, 3, null);
        t.newGareD("test", 10);
        t.newAboM("quentin", 10, "str");
        t.newAboA("gross", "28/11/1991", "col");
        t.reconduireX(0);
        t.reconduireX(0);
        t.listerGares();
        t.listerAbos();
        t.quitter();
    }

    

}
