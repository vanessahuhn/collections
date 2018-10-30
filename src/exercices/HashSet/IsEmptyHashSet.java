/*
5. Ecrire un programme Java pour tester un HashSet vide ou non.
 */
package exercices.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author vanessa
 */
public class IsEmptyHashSet {
    
    public static void check(HashSet<String> liste) {
        if (!liste.isEmpty())
            System.out.println("Liste pleine");
        else
            System.out.println("Liste vide");
    }
    
    public static void main(String[] args) {

        HashSet<String> liste = new HashSet<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        check(liste);

        Iterator<String> iterateur = liste.iterator();
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        liste.clear();
        
        check(liste);
        
        Iterator<String> iterateur2 = liste.iterator();
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }

    }
    
}
