package SNCF;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.5493982B-6C55-0EA7-EED4-9E61FB4BF40F]
// </editor-fold> 
public class G_gares {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C79EFF94-D88A-578A-B562-DCE3696C4ECB]
    // </editor-fold> 
    private static Gare_emettrice gare_emettrice;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.16DC16A2-54F9-C71F-BBB2-8498F0852486]
    // </editor-fold> 
    private ArrayList<Gare_distante> listeGare;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C29F47CF-3D1A-D076-1EF1-7C2763B55661]
    // </editor-fold> 
    public G_gares (String nom, String adresse) {
        this.listeGare = new ArrayList<Gare_distante>();
        G_gares.setGare_emettrice(new Gare_emettrice(nom,adresse));
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9A3E1572-0D83-E34C-949A-3A21C6959E6F]
    // </editor-fold> 
    public void nouvelleGare (String nom, int distance) {
        this.listeGare.add(new Gare_distante(nom,distance));
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.92F72C76-5D14-FD4C-2C73-7DD3165668CA]
    // </editor-fold> 
    public Gare_distante getGare (String nom) {
        int i; Gare_distante res = null;
        for(i=0;i<this.listeGare.size();i++)
        {
            if(this.listeGare.get(i).getNom().equals(nom))
            {
                res = this.listeGare.get(i);
            }
        }
        return res;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.96C4B0CE-5E8C-7D2A-DF40-EA9F591C5F49]
    // </editor-fold> 
    public ArrayList<Gare_distante> getListeGare () {
        return listeGare;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E9BA57E5-8B7F-EC51-5400-B5ABA19DA041]
    // </editor-fold> 
    public void setListeGare (ArrayList<Gare_distante> val) {
        this.listeGare = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.248F3BF9-1340-012A-27FD-54E515DCFE70]
    // </editor-fold> 
    public static Gare_emettrice getGare_emettrice () {
        return gare_emettrice;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F7C07E5B-AF3B-A867-6432-AE09F6554C01]
    // </editor-fold> 
    public static void setGare_emettrice (Gare_emettrice val) {
        G_gares.gare_emettrice = val;
    }

}

