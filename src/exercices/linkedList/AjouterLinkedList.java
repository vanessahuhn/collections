/*
1. Ecrire un programme Java pour ajouter l'élément spécifié à la fin d'une LinkedList.
 */
package exercices.linkedList;

import java.util.LinkedList;

/**
 *
 * @author vanessa
 */
public class AjouterLinkedList {

    public static void main(String[] args) {

        LinkedList<String> liste = new LinkedList<>();

        liste.add("rouge");

        System.out.println(liste);
        
        liste.add("bleu");

        System.out.println(liste);
        
        liste.addLast("jaune");
        
        System.out.println(liste);
    }

}
