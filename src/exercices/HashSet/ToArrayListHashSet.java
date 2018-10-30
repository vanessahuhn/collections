/*
8. Ecrire un programme Java pour convertir un HashSet défini en ArrayList.
 */
package exercices.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vanessa
 */
public class ToArrayListHashSet {
    
    public static void main(String[] args) {

        HashSet<String> liste = new HashSet<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        Iterator<String> iterateur = liste.iterator();
        
        System.out.println("Liste 1");
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        List<String> liste2 = new ArrayList<>(liste);
        
        System.out.println("Liste 1 en Array");
        
        Iterator<String> iterateur2 = liste2.iterator();
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }

    }
    
}
