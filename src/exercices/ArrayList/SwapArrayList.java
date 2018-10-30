/*
14. Ecrire un programme Java d'échange de deux éléments dans une arraylist.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class SwapArrayList {
    
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
        
        Collections.swap(liste, 0, 1);
        
        ListIterator<String> iterateur2 = liste.listIterator();
        
        System.out.println("Elements 0 et 1 inversés");
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }
        
        System.out.println("--------------------");        
        
    }
    
}
