/*
10. Ecrire un programme Java pour obtenir l’élément dans un TreeSet supérieur ou égal à l’élément donné.
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
public class ElementSupEgalTreeSet {
    
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

        System.out.println("Nombre le plus proche supérieur ou égal à 4 : " + liste.ceiling(4)); 
        System.out.println("Nombre le plus proche supérieur ou égal à 3 : " + liste.ceiling(3));
        
    }
    
}
