/*
10. Ecrire un programme Java pour comparer deux HashSets et conserver les éléments identiques dans les deux HashSets.
 */
package exercices.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author vanessa
 */
public class ComparerConserverHashSet {
    
    public static void compare(String element, HashSet<String> set, HashSet<String> conteneur){
        if (set.contains(element)){
            conteneur.add(element);
            System.out.println("L'élément " + element + " appartient aux deux listes");
        }
    }
    
    public static void main(String[] args) {

        HashSet<String> liste = new HashSet<>();
        HashSet<String> liste2 = new HashSet<>();
        HashSet<String> liste3 = new HashSet<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        liste2.add("vert");
        liste2.add("bleu");
        liste2.add("jaune");

        Iterator<String> iterateur = liste.iterator();
        
        System.out.println("Elements en commun :");
        
        while (iterateur.hasNext()) {
            compare(iterateur.next(), liste2, liste3);
        }
        
        System.out.println("Liste 3 contenant les éléments identiques");
        
        Iterator<String> iterateur3 = liste3.iterator();
        
        while (iterateur3.hasNext()) {
            System.out.println(iterateur3.next());
        }

    }
    
}
