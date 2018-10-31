/*
 * 6. Ecrire un programme Java pour supprimer le troisième élément d'une arraylist.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class DeleteElementArrayList {
    
    public static void main(String[] args) {
    
        ArrayList<String> liste = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        ListIterator<String> iterateur = liste.listIterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        liste.remove(2);
        
        ListIterator<String> iterateur2 = liste.listIterator();

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }
    }
    
}
