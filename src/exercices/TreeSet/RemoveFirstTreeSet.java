/*
14. Ecrire un programme Java pour récupérer et supprimer le premier élément d'un TreeSet.
 */
package exercices.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author vanessa
 */
public class RemoveFirstTreeSet {

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
        
        liste.remove(liste.first());
        
        Iterator<String> iterateur2 = liste.iterator();

        System.out.println("Liste sans le premier élément");

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }        

    }

}
