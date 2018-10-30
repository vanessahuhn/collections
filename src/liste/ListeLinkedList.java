/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class ListeLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciation de la liste
        List liste = new LinkedList();
        
        //ajout d'un entier à la liste
        liste.add(12);
        System.out.println("Résultat attendu [12] : " + liste);
        //ajout d'un String à la liste
        liste.add("toto !");
        System.out.println("Résultat attendu [12, toto !] : " + liste);
        //ajout d'un float à la liste
        liste.add(12.20f);
        System.out.println("Résultat attendu [12, toto !, 12.2] : " + liste);
        
        //parcourir la liste et imprimer chaque élément
        for (int i = 0; i <liste.size(); i++)
           System.out.println("Element à l'index " + i + " = " + liste.get(i));
        
        //parcourir la liste avec un itérateur
        System.out.println("\n \tParcours avec un itérateur ");
        System.out.println("----------");
        ListIterator li = liste.listIterator();
        while (li.hasNext())
            System.out.println(li.next());
    }
}
