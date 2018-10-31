/*
11. Ecrire un programme Java pour inverser des éléments dans une arraylist.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class InverserArrayList {
    
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
        
        Collections.reverse(liste);
        
        ListIterator<String> iterateur2 = liste.listIterator();
        
        System.out.println("Liste inversée");
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }
        
        System.out.println("--------------------");
    }
}
