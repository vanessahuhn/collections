/*
2. Ecrire un programme Java pour parcourir tous les éléments d'un HashSet.
 */
package exercices.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author vanessa
 */
public class ParcourirHashSet {

    public static void main(String[] args) {

        HashSet<String> liste = new HashSet<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        Iterator<String> iterateur = liste.iterator();
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

    }

}
