/*
1. Ecrire un programme Java pour ajouter l'élément spécifié à la fin d'un HashSet.
 */
package exercices.HashSet;

import java.util.HashSet;

/**
 *
 * @author vanessa
 */
public class AjouterHashSet {

    public static void main(String[] args) {

        HashSet<String> liste = new HashSet<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        System.out.println(liste);        

    }
}
