/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abo_sncf;
import SNCF.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author asus
 */
public class TestSNCF {

    private G_gares gestionGare;
    private G_abonnements gestionAbo;

    public TestSNCF()
    {
        
    }

    // 1. Lancer le jeu de test initial
    public void initJeuEssai()
    {
        this.gestionGare = new G_gares("sel","1, Place de la gare 67600 Sélestat");
        this.gestionAbo = new G_abonnements(10,20,2);
        
        gestionGare.nouvelleGare("str", 50);
        gestionGare.nouvelleGare("ben", 20);
        gestionGare.nouvelleGare("col", 30);

        gestionAbo.nouvelAboM("Stan",11,(Gare_distante)gestionGare.getGare("str"));
        gestionAbo.nouvelAboM("Bob",10,(Gare_distante)gestionGare.getGare("ben"));
        gestionAbo.nouvelAboM("Chris",9,(Gare_distante)gestionGare.getGare("col"));

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = null;
        try{d = sdf.parse("31/03/09");}
        catch (ParseException e) {
             e.printStackTrace();
        }
        gestionAbo.nouvelAboA("Cath",d,(Gare_distante)gestionGare.getGare("col"));
        Date d2 = null;
        try{d2 = sdf.parse("31/08/09");}
        catch (ParseException e) {
             e.printStackTrace();
        }
        gestionAbo.nouvelAboA("Bob",d2,(Gare_distante)gestionGare.getGare("str"));
    }

    // 2. Liste toutes les gares connues, nom et distance
    public void  listerGares()
    {
        ArrayList<Gare_distante> listeG = gestionGare.getListeGare();
        System.out.println("Gare emettrice : "+G_gares.getGare_emettrice().getNom()+" ("+G_gares.getGare_emettrice().getAdresse()+")");
        for(int i=0;i<listeG.size();i++)
        {
            System.out.println("Gare "+i+" : "+listeG.get(i).getNom()+" (distance "+listeG.get(i).getDistance()+")");
        }
        System.out.println("-------------Fin listage Gares----------------------\n");
    }

     // 3. Lister tous les abonnements et leur description
    public void listerAbos()
    {
        ArrayList<Abonnement> listeAb = gestionAbo.getListeAbo();
        for(int i =0;i<listeAb.size();i++)
        {
            System.out.println(listeAb.get(i).description());
        }
        System.out.println("-------------Fin listage Abonnements----------------\n");
    }

    // 4. Description de l'abonnement numéro X
    public void descAboX(int x)
    {
        System.out.println(this.gestionAbo.getAbo(x).description()+"\n");
    }

    // 5. Descriptions des abonnements au nom X
    public void descAboNom(String nom)
    {
        ArrayList<Abonnement> aAb = this.gestionAbo.getAbo(nom);
        for(int i =0;i<aAb.size();i++)
        {
             System.out.println(aAb.get(i).description()+"\n");
        }
    }

     // 6. Distance de la gare X
    public void distanceGareNom(String nom)
    {
        int dist = this.gestionGare.getGare(nom).getDistance();
        if(dist != 0)
        {
            System.out.println(dist);
        }
        else
        {
            System.out.println("La gare nommée "+nom+" est la gare émettrice.");
        }
    }

    // 7. Nombre total d'abonnements
    public void nbTotalAbo()
    {
        System.out.println("Nombre total d'abonnements : "+this.gestionAbo.getListeAbo().size()+"\n");
    }

    // 8. Modification des paramètres frais de dossier, tarifKmAnnuel, tarifKmMensuel, mention
    public void modifParams(int fraisD, int TKmA, int TKmM, String mentionA, String mentionM)
    {
        G_abonnements.setFrais_dossier(fraisD);
        Ab_mensuel.setTarifKm(TKmM);
        Ab_annuel.setTarifKm(TKmA);
        Ab_mensuel.setMention(mentionM);
        Ab_annuel.setMention(mentionA);
    }

    // 9. Nouvelle gare avec sa distance
    public void newGareD(String nom, int dist)
    {
        this.gestionGare.nouvelleGare(nom, dist);
    }

    // 10. Nouvel abonnement mensuel
    public void newAboM(String nom, int mois, String nomG)
    {
        this.gestionAbo.nouvelAboM(nom, mois, (Gare_distante) this.gestionGare.getGare(nomG));
    }

    // 11. Nouvel abonnement annuel
    public void newAboA(String nom, String d, String nomG)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try{date = sdf.parse(d);}
        catch (ParseException e) {
             e.printStackTrace();
        }
        this.gestionAbo.nouvelAboA(nom, date, (Gare_distante) this.gestionGare.getGare(nomG));
    }

    // 12. Reconduire l'abonnement mensuel numéro X
    public void reconduireX(int x)
    {
        Abonnement n = this.gestionAbo.getAbo(x);
        if(n instanceof Ab_mensuel)
        {
            Ab_mensuel n2 = (Ab_mensuel) n;
            n2.reconduire();
            System.out.println("Abonnement reconduit au : "+n2.getNum_mois()+"\n");
        }
        else
        {
            System.out.println("Impossible de reconduire un abonnement annuel !\n");
        }
    }

    // 13. Quitter
    public void quitter()
    {
        System.exit(0);
        this.gestionAbo = null;
        this.gestionGare = null;
    }
}
