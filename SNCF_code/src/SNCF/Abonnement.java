package SNCF;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.EA6AFFA5-49D3-8FAB-0B1D-24B5974292CB]
// </editor-fold> 
public abstract class Abonnement {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.076005E9-ECB7-9503-B2E3-F8066A341697]
    // </editor-fold> 
    private int num_abonnement;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CB40BFDE-5DD4-D135-C2AF-082F66963EA4]
    // </editor-fold> 
    private String nom_abonne;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.95B7EA2C-67D3-B71A-E9F7-A7D07B9D3FA1]
    // </editor-fold> 
    private Gare_distante gare_distante;


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5A6D049D-DCEF-529A-7C5B-DDC94CCCCDE4]
    // </editor-fold> 
    public String getNom_abonne () {
        return nom_abonne;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EE6A1D8C-302D-8A05-1FB2-8FFE7F126962]
    // </editor-fold> 
    public void setNom_abonne (String val) {
        this.nom_abonne = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D6F90AB8-BCDF-FD7D-4B64-79DE1F513908]
    // </editor-fold> 
    public int getNum_abonnement () {
        return num_abonnement;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F9A5B60B-A6CA-46DB-93EA-B1F03D7B5AE7]
    // </editor-fold> 
    public void setNum_abonnement (int val) {
        this.num_abonnement = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1968C76C-E776-0B9A-F86E-FE2D728E7D0E]
    // </editor-fold> 
    public abstract String getMention ();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EEB0A165-BED5-532A-6E7D-845ECFCFED34]
    // </editor-fold> 
    public abstract String description ();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1EAF2A7E-8726-5B55-7D57-DA8EA16C39B9]
    // </editor-fold> 
    public abstract float calcul_cout_abonnement ();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F7826597-CEA0-7498-AB87-1913D4D0A519]
    // </editor-fold> 
    public Gare_distante getGare_distante () {
        return gare_distante;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.82D2DBFB-80DF-7F1D-7146-F5CA1443AEE2]
    // </editor-fold> 
    public void setGare_distante (Gare_distante val) {
        this.gare_distante = val;
    }

}

