/*
 * 1. Ecrire un programme Java pour créer une nouvelle arraylist, ajoutez des couleurs (String)
et imprimer la collection.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanessa
 */
public class CreerArrayList {

    public static void main(String[] args) {

        ArrayList<String> liste = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");

        System.out.println(liste);

    }

}
