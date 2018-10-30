/*
16. Ecrire un programme Java pour supprimer un élément donné d’un TreeSet.
 */
package exercices.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author vanessa
 */
public class RemoveElementTreeSet {
    
    public static void main(String[] args) {

        HashSet<String> chaine = new HashSet<>();

        chaine.add("rouge");
        chaine.add("bleu");
        chaine.add("jaune");

        TreeSet liste = new TreeSet(chaine);

        Iterator<String> iterateur = liste.iterator();

        System.out.println("Liste");

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        liste.remove("jaune");
        
        Iterator<String> iterateur2 = liste.iterator();

        System.out.println("Liste sans l'élément 'jaune'");

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }        

    }
    
}
