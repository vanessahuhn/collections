/*
7. Ecrire un programme Java pour obtenir le nombre d'éléments d'un TreeSet.
 */
package exercices.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author vanessa
 */
public class NbElementsTreeSet {

    public static void main(String[] args) {

        HashSet<String> chaine = new HashSet<>();

        chaine.add("rouge");
        chaine.add("bleu");
        chaine.add("jaune");

        TreeSet liste = new TreeSet(chaine);

        Iterator<String> iterateur = liste.iterator();

        System.out.println("Liste 1");

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

        System.out.println("Nombre d'éléments dans la liste : " + liste.size());

    }

}
