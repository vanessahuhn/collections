/*
17. Ecrire un programme Java pour joindre deux LinkedLists.
 */
package exercices.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class JoinLinkedList {

    public static void main(String[] args) {

        LinkedList<String> liste = new LinkedList<>();
        LinkedList<String> liste2 = new LinkedList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        liste2.add("vert");
        liste2.add("violet");
        liste2.add("orange");

        System.out.println("Liste 1 :");

        ListIterator<String> iterateur = liste.listIterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

        System.out.println("Liste 2 :");

        ListIterator<String> iterateur2 = liste2.listIterator();

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }

        liste2.addAll(liste);

        System.out.println("Liste 2 + 1 :");

        ListIterator<String> iterateur3 = liste2.listIterator();

        while (iterateur3.hasNext()) {
            System.out.println(iterateur3.next());
        }

    }

}
