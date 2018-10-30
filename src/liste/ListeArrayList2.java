/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste;

import java.util.ArrayList;

/**
 *
 * @author vanessa
 */
public class ListeArrayList2 {
    
    public static void main(String[] args) {
        
        // instanciation de la liste
        ArrayList liste = new ArrayList();
        liste.add("Hello");
        liste.add(4);
        liste.add(12.20f);
        liste.add("Hi");
        
        for (int i = 0; i < liste.size(); i++){
            System.out.println("donnée à l'indice " + i + " = " + liste.get(i));
        }
    
    }
    
}
