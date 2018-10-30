/*
7. Ecrire un programme Java pour convertir un HashSet en un tableau.
 */
package exercices.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author vanessa
 */
public class ToArrayHashSet {
    
    public static void main(String[] args) {

        HashSet<String> liste = new HashSet<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        Iterator<String> iterateur = liste.iterator();
        
        System.out.println("Liste 1");
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        liste.toArray();
        
        System.out.println("Liste 1 en Array");
        
        Iterator<String> iterateur2 = liste.iterator();
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }

    }
    
}
