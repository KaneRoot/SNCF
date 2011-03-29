package SNCF;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.A72821C5-6C33-D877-A614-10CEF031AA6E]
// </editor-fold> 
public class Gare_distante extends Gare {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.706395B4-3A9B-3BD8-E982-1E8A57B7EEE9]
    // </editor-fold> 
    private int distance;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A29D55FB-48B0-6918-B6B1-87C375E45FAC]
    // </editor-fold> 
    public Gare_distante (String nom, int distance) {
        this.setNom(nom);
        this.setDistance(distance);
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.ABA64349-106B-C039-AA12-4DE969E1869C]
    // </editor-fold> 
    public int getDistance () {
        return distance;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6EFD6925-8D4B-A135-3FBF-B54C2F755754]
    // </editor-fold> 
    public void setDistance (int val) {
        this.distance = val;
    }

    @Override
    public String getAdresse() {
        return "";
    }

    @Override
    public boolean equals(Object g)
    {
        boolean res = false;
        if(g != null && g instanceof Gare_distante)
        {
            Gare_distante g2 = (Gare_distante) g;
            if(g2.getNom().equals(this.getNom()))
            {
                if(g2.getDistance()==this.distance)
                {
                    res = true;
                }
            }
        }
        return res;
    }

}

