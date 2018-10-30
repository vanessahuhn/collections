/*
11. Ecrire un programme Java pour supprimer tous les éléments d'un HashSet.
 */
package exercices.HashSet;

import static exercices.HashSet.ComparerConserverHashSet.compare;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author vanessa
 */
public class DeleteHashSet {
    
    public static void main(String[] args) {

        HashSet<String> liste = new HashSet<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        Iterator<String> iterateur = liste.iterator();
        
        System.out.println("Liste");
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        liste.clear();
        
        System.out.println("Liste supprimée");
        
        Iterator<String> iterateur2 = liste.iterator();
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }

    }
    
}
