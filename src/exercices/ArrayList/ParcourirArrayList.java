/*
 * 2. Ecrire un programme Java pour parcourir tous les éléments d&#39;une arraylist.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class ParcourirArrayList {

    public static void main(String[] args) {

        ArrayList<String> liste = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        ListIterator<String> iterateur = liste.listIterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

    }

}
