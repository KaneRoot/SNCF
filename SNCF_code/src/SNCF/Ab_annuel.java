package SNCF;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.15A0C38F-A285-CAA3-5789-2FE4B549A758]
// </editor-fold> 
public class Ab_annuel extends Abonnement {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7AB66F89-F54B-5BA0-F53F-77E0FDE22366]
    // </editor-fold> 
    private static String mention = "Abonnement annuel";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9EC9EA04-09AA-036D-A127-F559115A3A24]
    // </editor-fold> 
    private static int tarifKm;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B2702FA0-FB7C-3922-1B68-A892868A2D37]
    // </editor-fold> 
    private Date date_fin;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EF9E5538-85A8-19C1-5FEB-7E7984E9060E]
    // </editor-fold> 
    public Ab_annuel (int numeroAb, String nom, Date d, Gare_distante gareD) {
        this.setNum_abonnement(numeroAb);
        this.setNom_abonne(nom);
        this.date_fin = d;
        this.setGare_distante(gareD);
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.53218937-851E-1CB0-CB9A-C1528E78AAE6]
    // </editor-fold> 
    public Date getDate_fin () {
        return date_fin;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5629A630-BFB0-5FAD-1940-1DA8D15C7CC3]
    // </editor-fold> 
    public void setDate_fin (Date val) {
        this.date_fin = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E0E9604A-6D63-DA7D-877E-88DEE1007475]
    // </editor-fold> 
    public String getMention () {
        return Ab_annuel.mention;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.54C3438D-F07A-75FB-F02C-8BE75642E8B3]
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

        // 1. Choix de la langue
        Locale locale = Locale.getDefault();

        /** 2. Construction du DateFormat en choisiant un format :
         * SHORT = 01/01/2002
         * FULL = lundi 1 janvier 2002
         */
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
        
        res += "Validité : "+dateFormat.format(this.date_fin)+"\n";
        return res;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.30BE4F33-1183-1DC4-2022-5F82C68DDCE8]
    // </editor-fold> 
    public float calcul_cout_abonnement () {
        return (G_abonnements.getFrais_dossier()+Ab_annuel.getTarifKm()*this.getGare_distante().getDistance());
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.46288436-2B06-A0F1-A263-FAA812CA9997]
    // </editor-fold> 
    public static int getTarifKm () {
        return tarifKm;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.98B62D53-263E-9BF4-2DBE-1E3760437E6F]
    // </editor-fold> 
    public static void setTarifKm (int val) {
        Ab_annuel.tarifKm = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.64FA862A-E7EA-B745-F984-9D2B8974F1F6]
    // </editor-fold> 
    public static void setMention (String val) {
        Ab_annuel.mention = val;
    }

}

