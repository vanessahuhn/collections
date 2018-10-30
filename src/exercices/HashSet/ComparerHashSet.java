/*
9. Ecrire un programme Java pour comparer deux HashSets.
 */
package exercices.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author vanessa
 */
public class ComparerHashSet {
    
    public static void compare(String element, HashSet<String> set){
        if (set.contains(element)){
            System.out.println("L'élément " + element + " appartient aux deux listes.");
        }
    }
    
    public static void main(String[] args) {

        HashSet<String> liste = new HashSet<>();
        HashSet<String> liste2 = new HashSet<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        liste2.add("vert");
        liste2.add("bleu");
        liste2.add("jaune");

        Iterator<String> iterateur = liste.iterator();
        
        System.out.println("Elements en commun :");
        
        while (iterateur.hasNext()) {
            compare(iterateur.next(), liste2);
        }

    }
    
}
