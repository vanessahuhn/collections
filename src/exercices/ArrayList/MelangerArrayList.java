/*
10. Ecrire un programme Java pour mélanger les éléments dans une arraylist.
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
public class MelangerArrayList {
    
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
        
        Collections.shuffle(liste);
        
        ListIterator<String> iterateur2 = liste.listIterator();
        
        System.out.println("Liste mélangée 1");
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }
        
        System.out.println("--------------------");
        
        Collections.shuffle(liste);
        
        ListIterator<String> iterateur3 = liste.listIterator();
        
        System.out.println("Liste mélangée 2");
        
        while (iterateur3.hasNext()) {
            System.out.println(iterateur3.next());
        }
    }
    
}
