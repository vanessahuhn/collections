/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanessa
 */
public class ListeArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciation de la liste
        List<Integer> liste = new ArrayList<>();
        //on peut peupler la liste avec la méthode add(element)
        liste.add(1);
        liste.add(2);
        System.out.println("Résultat attendu : [1, 2] " +liste);
        //on peut la peupler aussi à partir d'une collection via la méthode addAll(Collection<Type> nomCollection)
        liste.addAll(liste);
        System.out.println("Résultat attendu : [1, 2, 1, 2] " + liste);
        //on peut accéder à l'élément d'indice i avec get(int i)
        System.out.println("Résultat attendu : 2 " + liste.get(3));
        //on peut récupérer l'indice d'un élément avec la méthode indexOf(element), retourne -1 si pas présent
        System.out.println("Résultat attendu : 0 " + liste.indexOf(1));
        System.out.println("Résultat attendu : -1 " + liste.indexOf(3));
        //on peut supprimer l'élément d'indice i avec remove(i)
        liste.remove(0);
        System.out.println("Résultat attendu : [2, 1, 2] " + liste);
        //on peut remplacer l'élément d'indice i par une nouvelle valeur avec set(indice, valeur)
        liste.set(0, 3);
        System.out.println("Résultat attendu : [3, 1, 2] " + liste);
    }
    
}
