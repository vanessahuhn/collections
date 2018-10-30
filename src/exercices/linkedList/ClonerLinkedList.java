/*
18. Ecrire un programme Java pour cloner une LinkedList en une autre LinkedList.
 */
package exercices.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class ClonerLinkedList {
    
    public static void main(String[] args) {

        LinkedList<String> liste = new LinkedList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        LinkedList<String> liste2 = (LinkedList<String>) liste.clone();

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

    }
    
}
