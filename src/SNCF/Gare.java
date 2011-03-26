package SNCF;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.9D7486B0-2DD0-789B-E00E-0065C003343F]
// </editor-fold> 
public abstract class Gare {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.208D6B3F-5CE9-C57E-5724-B82486B36C19]
    // </editor-fold> 
    private String nom;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.02C4486C-6553-18BE-48C5-91B44ECEA4E5]
    // </editor-fold> 
    public Gare (String nom, int distance) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1B6ECC07-A417-7618-7973-3689FFC0BC34]
    // </editor-fold> 
    public String getNom () {
        return nom;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.078C1CD0-1691-8312-699B-65562F369D13]
    // </editor-fold> 
    public void setNom (String val) {
        this.nom = val;
    }

}

