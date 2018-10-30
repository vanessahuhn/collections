/*
6. Ecrire un programme Java pour cloner un HashSet en un autre.
 */
package exercices.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author vanessa
 */
public class ClonerHashSet {
    
    public static void main(String[] args) {

        HashSet<String> liste = new HashSet<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        HashSet<String> liste2 = (HashSet<String>) liste.clone();

        Iterator<String> iterateur = liste.iterator();
        
        System.out.println("Liste 1");
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        System.out.println("Liste 2");
        
        Iterator<String> iterateur2 = liste2.iterator();
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }

    }
    
}
