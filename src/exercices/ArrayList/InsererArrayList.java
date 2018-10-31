/*
 * 3. Ecrire un programme Java pour insérer un élément dans l’ arraylist à la première position.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class InsererArrayList {

    public static void main(String[] args) {

        ArrayList<String> liste = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        ListIterator<String> iterateur = liste.listIterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

        liste.add(0, "vert");

        ListIterator<String> iterateur2 = liste.listIterator();

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }
    }

}
