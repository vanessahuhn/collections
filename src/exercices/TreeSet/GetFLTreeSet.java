/*
5. Ecrire un programme Java pour obtenir les premier et dernier éléments d'un TreeSet.
 */
package exercices.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author vanessa
 */
public class GetFLTreeSet {

    public static void main(String[] args) {

        HashSet<String> chaine = new HashSet<>();

        chaine.add("rouge");
        chaine.add("bleu");
        chaine.add("jaune");

        TreeSet liste = new TreeSet(chaine);

        Iterator<String> iterateur = liste.iterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

        System.out.println("Premier élément : " + liste.first());

        System.out.println("Dernier élément : " + liste.last());

    }

}
