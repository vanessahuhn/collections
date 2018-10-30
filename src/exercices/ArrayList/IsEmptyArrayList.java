/*
18. Ecrire un programme Java pour tester une arraylist est vide ou non.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class IsEmptyArrayList {
    
    public static void check(List<String> liste) {
        if (!liste.isEmpty())
            System.out.println("Liste pleine");
        else
            System.out.println("Liste vide");
    }
    
     public static void main(String[] args) {
    
        ArrayList<String> liste = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        check(liste);
        
        ListIterator<String> iterateur = liste.listIterator();
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        System.out.println("--------------------");
        
        liste.clear();
        
        ListIterator<String> iterateur2 = liste.listIterator();
        
        check(liste);
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }
        
        System.out.println("--------------------");
        
     }   
    
}
