/*
 * En utilisant la classe LinkedList, créez une liste avec les noms d'étudiants (Jean, Philippe, Corine, Isabelle, Charles, Paul).
 * Afficher les noms et leurs longueurs :
 * 1. A partir du premier jusqu'au dernier élément de la liste
 * 2. A partir du dernier jusqu'au premier élément de la liste
 * 1. En plus, trier la liste (en utilisant la méthode de tri de la classe Collections).
 */
package liste;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class ExerciceLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List liste = new LinkedList();
        liste.add("Jean");
        liste.add("Philippe");
        liste.add("Corine");
        liste.add("Isabelle");
        liste.add("Charles");
        liste.add("Paul");

        //Afficher les noms et leurs longueurs à partir du premier jusqu'au dernier élément de la liste
        ListIterator li1 = liste.listIterator();

        System.out.println("Du premier au dernier :");

        while (li1.hasNext()) {

            String nom = (String) li1.next();
            System.out.println(nom + " longueur = " + nom.length());
        }

        System.out.println("---------------------------");
        System.out.println("Du dernier au premier :");

        ListIterator li2 = liste.listIterator(liste.indexOf(liste.get(liste.size() - 1)));

        while (li2.hasPrevious()) {

            String nom = (String) li2.previous();
            System.out.println(nom + " longueur = " + nom.length());
        }

        System.out.println("---------------------------");
        System.out.println("Liste triée :");

        Collections.sort(liste);
        System.out.println(liste);
    }

}
