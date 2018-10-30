/*
15. Ecrire un programme Java pour récupérer et supprimer le dernier élément d'un TreeSet.
 */
package exercices.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author vanessa
 */
public class RemoveLastTreeSet {
    
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
        
        liste.remove(liste.last());
        
        Iterator<String> iterateur2 = liste.iterator();

        System.out.println("Liste sans le dernier élément");

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }        

    }
    
}
