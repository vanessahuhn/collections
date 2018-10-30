/*
12. Ecrire un programme Java pour extraire une partie d'une arraylist.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class ExtrairePartieArrayList {
    
    public static void main(String[] args) {
    
        ArrayList<String> liste = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        ListIterator<String> iterateur = liste.listIterator();
        
        System.out.println("Liste initiale");
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        System.out.println("--------------------");
        
        List<String> sublist = liste.subList(1, 3);
        
        ListIterator<String> iterateur2 = sublist.listIterator();
        
        System.out.println("Sous-liste");
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }
        
        System.out.println("--------------------");
    }
}
