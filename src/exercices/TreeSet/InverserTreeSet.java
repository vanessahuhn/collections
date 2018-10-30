/*
4. Ecrire un programme Java pour créer une vue inverse des éléments contenus dans un TreeSet donné.
 */
package exercices.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author vanessa
 */
public class InverserTreeSet {
    
    public static void main(String[] args) {
        
        HashSet<String> chaine = new HashSet<>();

        chaine.add("rouge");
        chaine.add("bleu");
        chaine.add("jaune");
    
        TreeSet liste = new TreeSet(chaine);
        
        System.out.println(liste);        
        
        System.out.println(liste.descendingSet());
        
        Iterator<String> iterateur = liste.iterator();
        
        System.out.println("Liste");
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        Iterator<String> iterateur2 = liste.descendingIterator();
        
        System.out.println("Liste");
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }
    
    }
    
}
