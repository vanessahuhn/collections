/*
9. Ecrire un programme Java pour insérer des éléments à la position spécifiée dans une LinkedList.
 */
package exercices.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class InsertElementsLinkedList {

    public static void main(String[] args) {

        LinkedList<String> liste = new LinkedList<>();
        LinkedList<String> liste2 = new LinkedList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        liste2.add("orange");
        liste2.add("vert");
        liste2.add("violet");

        System.out.println("Liste d'origine");

        ListIterator<String> iterateur = liste.listIterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

        liste.addAll(1, liste2);

        System.out.println("Ajout des éléments en position 1");

        ListIterator<String> iterateur2 = liste.listIterator();

        while (iterateur2.hasNext()) {            
            System.out.println(iterateur2.next());
        }

    }

}
