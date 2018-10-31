/*
13. Ecrire un programme Java pour comparer deux arraylists.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class ComparerArrayList {
    
    public static void main(String[] args) {
    
        ArrayList<String> liste = new ArrayList<>();
        ArrayList<String> liste2 = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        liste2.add("rouge");
        liste2.add("vert");
        liste2.add("jaune");
        
        ListIterator<String> iterateur = liste.listIterator();
        ListIterator<String> iterateur2 = liste2.listIterator();
        
        while (iterateur2.hasNext()) {
            String couleur1 = iterateur.next();
            String couleur2 = iterateur2.next();
            if (couleur1.equals(couleur2))
                System.out.println("L'élément " + couleur1 + " des deux listes en position " + liste.indexOf(couleur1) + " est identique.");
            else
                 System.out.println("L'élément en position " + liste.indexOf(couleur1) + " est " + couleur1 + " dans la liste 1 et " + couleur2 + " dans la liste2.");
        }
    }
    
}
