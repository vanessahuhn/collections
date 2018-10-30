/*
10. Ecrire un programme Java pour obtenir la première et la dernière occurrence des éléments spécifiés dans une LinkedList.
 */
package exercices.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class GetLinkedList {

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

        System.out.println("Premier élément de la liste : " + liste.getFirst());

        System.out.println("Dernier élément de la liste : " + liste.getLast());

    }

}
