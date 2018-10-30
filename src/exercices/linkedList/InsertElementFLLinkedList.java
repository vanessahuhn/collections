/*
6. Ecrire un programme Java pour insérer des éléments dans la LinkedList en première et dernière position.
 */
package exercices.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class InsertElementFLLinkedList {

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

        liste.add(0, "vert");

        System.out.println("Ajout de l'élément 'vert' en première position");

        ListIterator<String> iterateur2 = liste.listIterator();

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }
        
        liste.add(liste.size(),"violet");

        System.out.println("Ajout de l'élément 'violet' en dernière position");

        ListIterator<String> iterateur3 = liste.listIterator();

        while (iterateur3.hasNext()) {
            System.out.println(iterateur3.next());
        }

    }

}
