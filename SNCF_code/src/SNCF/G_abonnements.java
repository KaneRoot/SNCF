package SNCF;

import java.util.ArrayList;
import java.util.Date;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E6F759F1-00B6-0B14-DAC0-A92ED7451CBD]
// </editor-fold> 
public class G_abonnements {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8C2C0968-67B1-00E1-47ED-6BFF9EA59274]
    // </editor-fold> 
    private int compteur;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6EF5DF5E-6C83-2CC8-7088-C99AA5F6818B]
    // </editor-fold> 
    private int frais_dossier;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2DE490B6-567F-E9F1-A6D4-68A7338F97BE]
    // </editor-fold> 
    public G_abonnements (int frais_dossier) {
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
        this.compteur = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1ECF6CA5-CDBF-41F5-53A5-1E720EFAB03C]
    // </editor-fold> 
    public int getFrais_dossier () {
        return frais_dossier;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.51A292EA-2C16-C576-D2E0-7EC5B767815E]
    // </editor-fold> 
    public void setFrais_dossier (int val) {
        this.frais_dossier = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.10F12F66-C689-B231-100D-0DD0FD0759E9]
    // </editor-fold> 
    public ArrayList<Abonnement> ListerTsLesAbo () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FC9D164A-944A-1A2E-C7AB-DCF2E6D0EBF6]
    // </editor-fold> 
    public void nouvelAboA (String nom, Date d, Gare g) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3D194124-1787-80B4-296C-71FFF3159E23]
    // </editor-fold> 
    public void nouvelAboM (String nom, int numMois, Gare g) {
    }

}

