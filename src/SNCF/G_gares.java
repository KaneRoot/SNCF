package SNCF;

import java.util.ArrayList;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.5493982B-6C55-0EA7-EED4-9E61FB4BF40F]
// </editor-fold> 
public class G_gares {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B92D1061-A5FF-0847-73F6-8B7BE7115FD6]
    // </editor-fold> 
    private Gare gare_emettrice;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C29F47CF-3D1A-D076-1EF1-7C2763B55661]
    // </editor-fold> 
    public G_gares (String nom, String adresse) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.72786639-099A-7EAA-A18D-38CE3C56EE08]
    // </editor-fold> 
    public ArrayList<Gare> ListerTtesLesGares () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9A3E1572-0D83-E34C-949A-3A21C6959E6F]
    // </editor-fold> 
    public void nouvelleGare (String nom, int distance) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.92F72C76-5D14-FD4C-2C73-7DD3165668CA]
    // </editor-fold> 
    public Gare getGare (String nom) {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EDB64C1F-ECB3-7EC8-1307-302198B773C4]
    // </editor-fold> 
    public Gare getGare_emettrice () {
        return gare_emettrice;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.517E7A46-030B-B937-F990-93D8D49B02A0]
    // </editor-fold> 
    public void setGare_emettrice (Gare val) {
        this.gare_emettrice = val;
    }

}

