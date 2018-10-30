/*
13. Ecrire un programme Java pour obtenir un élément dans un TreeSet strictement inférieur à l’élément donné.
 */
package exercices.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author vanessa
 */
public class ElementInfTreeSet {
    
    public static void main(String[] args) {

        HashSet<Integer> chaine = new HashSet<>();

        chaine.add(1);
        chaine.add(3);
        chaine.add(7);
        chaine.add(10);

        TreeSet liste = new TreeSet(chaine);
        
        System.out.println("Liste de nombres");
        
        Iterator<Integer> iterateur = liste.iterator();

        while (iterateur.hasNext()) {
             System.out.println(iterateur.next());
        }

        System.out.println("Nombre le plus proche strictement inférieur à 4 : " + liste.lower(4)); 
        System.out.println("Nombre le plus proche strictement inférieur à 3 : " + liste.lower(3));
        System.out.println("Nombre le plus proche strictement inférieur à 1 : " + liste.lower(1));
        
    }
    
}
