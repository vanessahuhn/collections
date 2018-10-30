/*
11. Ecrire un programme Java pour afficher les éléments et leurs positions dans une LinkedList.
 */
package exercices.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class AfficherElementsLinkedList {

    public static void main(String[] args) {

        LinkedList<String> liste = new LinkedList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        System.out.println("Liste :");

        ListIterator<String> iterateur = liste.listIterator();

        while (iterateur.hasNext()) {
            int index = liste.indexOf(iterateur.next());
            System.out.println("Element -> " + liste.get(index) + " || position -> " + index );
        }

    }

}
