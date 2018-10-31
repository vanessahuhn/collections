/*
4. Ecrire un programme Java pour itérer une LinkedList dans l'ordre inverse.
 */
package exercices.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class ItererLinkedList {
    
    public static void main(String[] args) {

        LinkedList<String> liste = new LinkedList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        System.out.println("Itération");

        ListIterator<String> iterateur = liste.listIterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        System.out.println("Itération en ordre inverse");

        ListIterator<String> iterateur2 = liste.listIterator(liste.size());

        while (iterateur2.hasPrevious()) {
            System.out.println(iterateur2.previous());
        }

    }
}
