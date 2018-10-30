/*
5. Ecrire un programme Java pour insérer l'élément spécifié à la position spécifiée dans la LinkedList.
 */
package exercices.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class InsertElementLinkedList {

    public static void main(String[] args) {

        LinkedList<String> liste = new LinkedList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        System.out.println("Liste d'origine");

        ListIterator<String> iterateur = liste.listIterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

        liste.add(1, "vert");

        System.out.println("Ajout de l'élément 'vert' en position 1");

        ListIterator<String> iterateur2 = liste.listIterator();

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }

    }

}
