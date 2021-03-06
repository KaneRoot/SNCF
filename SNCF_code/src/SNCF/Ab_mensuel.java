package SNCF;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.631AF0BF-1B9F-105B-AC55-04B73816D21A]
// </editor-fold> 
public class Ab_mensuel extends Abonnement {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0D95F58C-EAA2-EA4E-E133-FB2731FAE79D]
    // </editor-fold> 
    private static String mention = "Abonnement mensuel";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0E866128-8639-2535-D4C3-885A8B5A11F0]
    // </editor-fold> 
    private static int tarifKm;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BF51FC02-37FE-7AF3-4C2E-6100E5C74582]
    // </editor-fold> 
    private int num_mois;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C8E56300-BAEE-B0E3-F890-E5CBB226967E]
    // </editor-fold> 
    public Ab_mensuel (int numeroAb, String nom, int mois, Gare_distante gareD) {
        this.setNum_abonnement(numeroAb);
        this.setNom_abonne(nom);
        this.num_mois = mois;
        this.setGare_distante(gareD);
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5B7B68B1-8EE9-62AB-4B01-9A9992173F9D]
    // </editor-fold> 
    public int getNum_mois () {
        return num_mois;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8D00D94B-07A2-7B3F-ACC7-D4F388C4952C]
    // </editor-fold> 
    public void setNum_mois (int val) {
        this.num_mois = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EF938385-29BB-76AF-32BF-C9680C7D98D9]
    // </editor-fold> 
    public void reconduire () {
        if(this.num_mois==12)
        {
            this.num_mois=1;
        }
        else
        {
            this.num_mois++;
        }
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C878E5BF-7897-D1E6-4AE3-0EE90E54E4F1]
    // </editor-fold> 
    public String getMention () {
        return Ab_mensuel.mention;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9209C915-553A-D3EA-7E15-FB10246115D7]
    // </editor-fold> 
    public String description () {
        String res = "";
        res += "Numéro de l'abonnement : "+this.getNum_abonnement()+"\n";
        res += "Nom de l'abonné : "+this.getNom_abonne()+"\n";
        res += "Type : "+this.getMention()+"\n";
        res += "Gare émettrice : "+G_gares.getGare_emettrice().getNom()+ " ("+G_gares.getGare_emettrice().getAdresse()+")\n";
        res += "Gare distante : "+this.getGare_distante().getNom()+"\n";
        res += "Distance : "+this.getGare_distante().getDistance()+"\n";
        res += "Cout de l'abonnement : "+this.calcul_cout_abonnement()+"\n";
        res += "Validité : mois "+this.num_mois+"\n";
        return res;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0A28974C-C371-E8B1-4118-588C2DC60593]
    // </editor-fold> 
    public float calcul_cout_abonnement () {
        return (G_abonnements.getFrais_dossier()+Ab_mensuel.getTarifKm()*this.getGare_distante().getDistance());
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9E991F77-87CC-8AEE-F55E-E097EAD5DA03]
    // </editor-fold> 
    public static int getTarifKm () {
        return tarifKm;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CBAA41FC-6E5A-5D15-7066-F00C84F2F5E6]
    // </editor-fold> 
    public static void setTarifKm (int val) {
        Ab_mensuel.tarifKm = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C77E6564-78A8-9682-5EA3-D70E44D057AE]
    // </editor-fold> 
    public static void setMention (String val) {
        Ab_mensuel.mention = val;
    }

}

