/*
3. Ecrire un programme Java pour obtenir le nombre d'éléments d'un HashSet.
 */
package exercices.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author vanessa
 */
public class SizeHashSet {
    
    public static void main(String[] args) {

        HashSet<String> liste = new HashSet<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        Iterator<String> iterateur = liste.iterator();
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        System.out.println("Nombre d'éléments du HashSet : " + liste.size());

    }
    
}
