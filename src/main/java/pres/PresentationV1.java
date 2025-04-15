package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main (String[] args) {
// injection dep par instanciation statique
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);// injection via setter
        System.out.println("res="+metier.calcul());
    }
}
