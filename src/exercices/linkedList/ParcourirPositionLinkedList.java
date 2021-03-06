/*
3. Ecrire un programme Java pour parcourir tous les éléments d'une LinkedList en commençant à la position spécifiée.
 */
package exercices.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class ParcourirPositionLinkedList {

    public static void main(String[] args) {

        LinkedList<String> liste = new LinkedList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        System.out.println("Itération en position 0");

        ListIterator<String> iterateur = liste.listIterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        System.out.println("Itération en position 1");

        ListIterator<String> iterateur2 = liste.listIterator(1);

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }

    }

}
