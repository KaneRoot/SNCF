package SNCF;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.1B604CFA-4729-5B08-7C15-480FD0ECBFBF]
// </editor-fold> 
public class Gare_emettrice extends Gare {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B9EDF45F-85B7-46F2-F84C-26E4D489B705]
    // </editor-fold> 
    private String adresse;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3200CEA2-FF00-2CA9-6C56-6630209A1DD9]
    // </editor-fold> 
    public Gare_emettrice (String nom, String adresse) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.43D36875-6EE0-269A-F6F9-7BB392253ABC]
    // </editor-fold> 
    public String getAdresse () {
        return adresse;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A04FBBB4-A71B-7C84-385C-94F4F52873A5]
    // </editor-fold> 
    public void setAdresse (String val) {
        this.adresse = val;
    }

}
