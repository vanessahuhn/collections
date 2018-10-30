/*
9. Ecrire un programme Java pour trouver les nombres inférieurs à 7 dans un TreeSet.
 */
package exercices.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author vanessa
 */
public class Inferieur7TreeSet {
    
    public static void main(String[] args) {

        HashSet<Integer> chaine = new HashSet<>();

        chaine.add(1);
        chaine.add(3);
        chaine.add(7);
        chaine.add(10);

        TreeSet liste = new TreeSet(chaine);

        Iterator<Integer> iterateur = liste.iterator();

        System.out.println("Liste de nombres");

        while (iterateur.hasNext()) {
             System.out.println(iterateur.next());
        }
        
        SortedSet liste7 = liste.headSet(7);
        
        Iterator<Integer> iterateur2 = liste7.iterator();

        System.out.println("Liste de nombres inférieurs à 7");
        
        while (iterateur2.hasNext()) {
             System.out.println(iterateur2.next());
        }

    }
    
}
