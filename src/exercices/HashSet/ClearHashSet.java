/*
4. Ecrire un programme Java pour vider un HashSet.
 */
package exercices.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author vanessa
 */
public class ClearHashSet {
    
    public static void main(String[] args) {

        HashSet<String> liste = new HashSet<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        Iterator<String> iterateur = liste.iterator();
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        System.out.println("HashSet vide :");
        
        liste.clear();
        
        Iterator<String> iterateur2 = liste.iterator();
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }

    }
    
    
    
}
