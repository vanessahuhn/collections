/*
16. Ecrire un programme Java pour cloner une arraylist en une autre liste.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class ClonerArrayList {

    public static void main(String[] args) {

        ArrayList<String> liste = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        ArrayList<String> liste2 = (ArrayList<String>) liste.clone();

        System.out.println("Liste 1");

        ListIterator<String> iterateur = liste.listIterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

        System.out.println("--------------------");

        ListIterator<String> iterateur2 = liste2.listIterator();

        System.out.println("Liste 2 clonée sur liste 1");

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }

        System.out.println("--------------------");

    }

}
