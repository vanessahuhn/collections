/*
17. Ecrire un programme Java pour vider une arraylist.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class ViderArrayList {
    
    public static void main(String[] args) {
    
        ArrayList<String> liste = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        System.out.println("Liste pleine");
        
        ListIterator<String> iterateur = liste.listIterator();
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        System.out.println("--------------------");
        
        liste.clear();
        
        ListIterator<String> iterateur2 = liste.listIterator();
        
        System.out.println("Liste vide");
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }
        
        System.out.println("--------------------");
        
    }
    
}
