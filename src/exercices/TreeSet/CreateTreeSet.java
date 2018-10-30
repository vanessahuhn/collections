/*
1. Ecrire un programme Java pour créer un nouvel TreeSet, ajoutez des couleurs (chaîne) et imprimez-les.
 */
package exercices.TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author vanessa
 */
public class CreateTreeSet {
    
    public static void main(String[] args) {
        
        HashSet<String> chaine = new HashSet<>();

        chaine.add("rouge");
        chaine.add("bleu");
        chaine.add("jaune");
    
        TreeSet liste = new TreeSet(chaine);
         
        System.out.println(liste);
    
    }
}
