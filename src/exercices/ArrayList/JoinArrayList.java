/*
15. Ecrire un programme Java pour joindre deux arraylists.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class JoinArrayList {
    
    public static void main(String[] args) {
    
        ArrayList<String> liste = new ArrayList<>();
        ArrayList<String> liste2 = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        liste2.add("violet");
        liste2.add("vert");
        liste2.add("orange");
        
        System.out.println("Liste 1");
        
        ListIterator<String> iterateur = liste.listIterator();
        
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
        System.out.println("--------------------");
        
        ListIterator<String> iterateur2 = liste2.listIterator();
        
        System.out.println("Liste 2");
        
        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }
        
        System.out.println("--------------------");
        
        liste2.addAll(liste);
        
        ListIterator<String> iterateur3 = liste2.listIterator();
        
        System.out.println("Liste 2 + liste 1");
        
        while (iterateur3.hasNext()) {
            System.out.println(iterateur3.next());
        }
        
        System.out.println("--------------------");
        
    }
    
}
