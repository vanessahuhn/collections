/*
9. Ecrire un programme Java pour copier une arraylist dans une autre.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class CopierArrayList {

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
        
        //(liste destination, liste source)
        Collections.copy(liste2, liste);
        
        ListIterator<String> iterateur3 = liste2.listIterator();
        
        System.out.println("Liste 2 copiée à partir de liste 1");
        
        while (iterateur3.hasNext()) {
            System.out.println(iterateur3.next());
        }
        
        System.out.println("--------------------");
        
    }

}
