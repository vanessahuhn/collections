/*
6. Ecrire un programme Java pour cloner un TreeSet en un autre.
 */
package exercices.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author vanessa
 */
public class ClonerTreeSet {
    
    public static void main(String[] args) {

        HashSet<String> chaine = new HashSet<>();

        chaine.add("rouge");
        chaine.add("bleu");
        chaine.add("jaune");

        TreeSet liste = new TreeSet(chaine);
        TreeSet liste2 = (TreeSet) liste.clone();
        
        System.out.println("Liste 1");

        Iterator<String> iterateur = liste.iterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        System.out.println("Liste 2");
        
        Iterator<String> iterateur2 = liste2.iterator();

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }

    }
    
}
