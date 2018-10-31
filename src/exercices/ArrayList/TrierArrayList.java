/*
 8. Ecrire un programme Java pour trier une arraylist donnée.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class TrierArrayList {
    
    public static void main(String[] args) {
    
    ArrayList<String> liste = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        Collections.sort(liste);
        
        ListIterator<String> iterateur = liste.listIterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
    }
    
    
}
