/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author vanessa
 */
public class ElementSupTreeSet {
    
    public static void main(String[] args) {

        HashSet<Integer> chaine = new HashSet<>();

        chaine.add(1);
        chaine.add(3);
        chaine.add(7);
        chaine.add(10);

        TreeSet liste = new TreeSet(chaine);
        
        System.out.println("Liste de nombres");
        
        Iterator<Integer> iterateur = liste.iterator();

        while (iterateur.hasNext()) {
             System.out.println(iterateur.next());
        }

        System.out.println("Nombre le plus proche strictement supérieur à 4 : " + liste.higher(4)); 
        System.out.println("Nombre le plus proche strictement supérieur à 3 : " + liste.higher(3));
        System.out.println("Nombre le plus proche strictement supérieur à 3 : " + liste.higher(10));
        
    }
    
}
