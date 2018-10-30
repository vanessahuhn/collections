/*
13. Ecrire un programme Java pour supprimer le premier et le dernier élément d'une LinkedList.
 */
package exercices.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class DeleteFLLinkedList {

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

        liste.removeFirst();

        System.out.println("Premier élément supprimé :");

        ListIterator<String> iterateur2 = liste.listIterator();

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }

        liste.removeLast();

        System.out.println("Dernier élément supprimé :");

        ListIterator<String> iterateur3 = liste.listIterator();

        while (iterateur3.hasNext()) {
            System.out.println(iterateur3.next());
        }

    }

}
