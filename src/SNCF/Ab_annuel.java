package SNCF;

import java.util.Date;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.15A0C38F-A285-CAA3-5789-2FE4B549A758]
// </editor-fold> 
public class Ab_annuel extends Abonnement {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B2702FA0-FB7C-3922-1B68-A892868A2D37]
    // </editor-fold> 
    private Date date_fin;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EF9E5538-85A8-19C1-5FEB-7E7984E9060E]
    // </editor-fold> 
    public Ab_annuel (Date d, String nom, Gare gare, int numeroAb) {
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
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.54C3438D-F07A-75FB-F02C-8BE75642E8B3]
    // </editor-fold> 
    public String description () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.30BE4F33-1183-1DC4-2022-5F82C68DDCE8]
    // </editor-fold> 
    public void calcul_cout_abonnement () {
    }

}

