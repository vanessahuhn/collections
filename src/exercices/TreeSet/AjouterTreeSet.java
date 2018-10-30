/*
3. Ecrire un programme Java pour ajouter tous les éléments d'un TreeSet spécifié à un autre.
 */
package exercices.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author vanessa
 */
public class AjouterTreeSet {
    
    public static void main(String[] args) {
        
        HashSet<String> chaine = new HashSet<>();
        HashSet<String> chaine2 = new HashSet<>();

        chaine.add("rouge");
        chaine.add("bleu");
        chaine.add("jaune");
        
        chaine2.add("vert");
        chaine2.add("violet");
        chaine2.add("orange");
    
        TreeSet liste = new TreeSet(chaine);
        TreeSet liste2 = new TreeSet(chaine2);
         
        Iterator<String> iterateur = liste.iterator();
        
        System.out.println("Liste 1");
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        Iterator<String> iterateur2 = liste2.iterator();
        
        System.out.println("Liste 2");
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }
        
        liste2.addAll(liste);
        
        Iterator<String> iterateur3 = liste2.iterator();
        
        System.out.println("Liste 2 + 1");
        
        while (iterateur3.hasNext()) {
            System.out.println(iterateur3.next());
        }
    
    }
    
}
