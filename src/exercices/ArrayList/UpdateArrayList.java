/*
 * 5. Ecrire un programme Java pour mettre à jour un élément spécifique par élément donné.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class UpdateArrayList {
    
    public static void main(String[] args) {
    
        ArrayList<String> liste = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        ListIterator<String> iterateur = liste.listIterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        liste.set(2, "vert");
        
        ListIterator<String> iterateur2 = liste.listIterator();

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }
    
    }
    
}
