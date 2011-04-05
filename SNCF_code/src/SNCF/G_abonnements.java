package SNCF;

import java.util.ArrayList;
import java.util.Date; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E6F759F1-00B6-0B14-DAC0-A92ED7451CBD]
// </editor-fold> 
public class G_abonnements {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.513DCB47-0A0D-7B1E-4975-2160FABC5006]
    // </editor-fold> 
    private ArrayList<Abonnement> listeAbo;


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8C2C0968-67B1-00E1-47ED-6BFF9EA59274]
    // </editor-fold> 
    private static int compteur;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6EF5DF5E-6C83-2CC8-7088-C99AA5F6818B]
    // </editor-fold> 
    private static int frais_dossier;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2DE490B6-567F-E9F1-A6D4-68A7338F97BE]
    // </editor-fold> 
    public G_abonnements (int frais_dossier, int tarifKmA, int tarifKmM) {
        G_abonnements.frais_dossier = frais_dossier;
        G_abonnements.compteur = 1;
        this.setTarifKmA(tarifKmA);
        this.setTarifKmM(tarifKmM);
        this.listeAbo = new ArrayList<Abonnement>();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.025160CE-53BF-6E0C-FCEF-B8AC5F4B674D]
    // </editor-fold> 
    public int getCompteur () {
        return compteur;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6FD64FA8-A30C-4AAA-4920-DF6E0554E223]
    // </editor-fold> 
    public void setCompteur (int val) {
        G_abonnements.compteur = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1ECF6CA5-CDBF-41F5-53A5-1E720EFAB03C]
    // </editor-fold> 
    public static int getFrais_dossier () {
        return frais_dossier;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.51A292EA-2C16-C576-D2E0-7EC5B767815E]
    // </editor-fold> 
    public static void setFrais_dossier (int val) {
        G_abonnements.frais_dossier = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FC9D164A-944A-1A2E-C7AB-DCF2E6D0EBF6]
    // </editor-fold> 
    public void nouvelAboA (String nom, Date d, Gare_distante g) {
        this.listeAbo.add(new Ab_annuel(G_abonnements.compteur, nom, d, g));
        G_abonnements.compteur++;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3D194124-1787-80B4-296C-71FFF3159E23]
    // </editor-fold> 
    public void nouvelAboM (String nom, int numMois, Gare_distante g) {
        this.listeAbo.add(new Ab_mensuel(G_abonnements.compteur, nom, numMois, g));
        G_abonnements.compteur++;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AEECF046-FF4B-C2BA-75E8-CD3544D4D0DF]
    // </editor-fold> 
    public ArrayList<Abonnement> getListeAbo () {
        return listeAbo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B92C9F8F-3302-B762-8FDD-1B1F43C3FA8A]
    // </editor-fold> 
    public void setListeAbo (ArrayList<Abonnement> val) {
        this.listeAbo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D7B71E84-A2A6-CDE7-E73B-05F1BC3A00C8]
    // </editor-fold> 
    public void setTarifKmA (int tarif) {
        Ab_annuel.setTarifKm(tarif);
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A4508FF8-F12B-89C0-2F37-CEF54527553F]
    // </editor-fold> 
    public void setTarifKmM (int tarif) {
        Ab_mensuel.setTarifKm(tarif);
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C8B9F4D5-6464-D25D-B3CB-CBC296317BF3]
    // </editor-fold> 
    public int nbAbos (Gare g) {
        int i; int res = 0;
        for(i=0;i<this.listeAbo.size();i++)
        {
            if(this.listeAbo.get(i).getGare_distante().equals(g))
            {
                res++;
            }
        }
        return res;
    }

     public int nbAbos (Gare_emettrice g) {
        return this.listeAbo.size();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5A264222-6D16-3405-50F1-C26E91E8F651]
    // </editor-fold> 
    public Abonnement getAbo (int num) {
        int i; Abonnement res = null;
        for(i=0;i<this.listeAbo.size();i++)
        {
            if(this.listeAbo.get(i).getNum_abonnement()==num)
            {
                res = this.listeAbo.get(i);
            }
        }
        return res;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A7F953F6-22EB-BBC6-9ABD-B8F15812FB30]
    // </editor-fold> 
    public ArrayList<Abonnement> getAbo (String nom) {
        int i; ArrayList<Abonnement> res = new ArrayList<Abonnement>();
        for(i=0;i<this.listeAbo.size();i++)
        {
            if(this.listeAbo.get(i).getNom_abonne().equals(nom))
            {
                res.add(this.listeAbo.get(i));
            }
        }
        return res;
    }

}

