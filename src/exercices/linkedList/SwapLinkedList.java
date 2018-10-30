/*
15. Ecrire un programme Java d'échange de deux éléments dans une LinkedList.
 */
package exercices.linkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class SwapLinkedList {
    
    public static void main(String[] args) {

        LinkedList<String> liste = new LinkedList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        System.out.println("Liste :");

        ListIterator<String> iterateur = liste.listIterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

        Collections.swap(liste, 0, 1);

        System.out.println("Elements index 0 et 1 échangés");

        ListIterator<String> iterateur2 = liste.listIterator();

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }

    }
    
}
