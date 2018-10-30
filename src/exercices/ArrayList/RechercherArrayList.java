/*
 * 7. Ecrire un programme Java pour rechercher un élément dans une arraylist.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanessa
 */
public class RechercherArrayList {
    
    public static boolean rechercherElement(String element){
        
        ArrayList<String> liste = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        if (liste.contains(element))
            return true;
        else
            return false;               
            }
    
    public static void isElement(String element){
        
        if (rechercherElement(element))
            System.out.println("L'élément " + element + " est présent dans la liste.");
        else
            System.out.println("L'élément " + element + " n'est pas présent dans la liste.");
    }   
    
    public static void main(String[] args) {
        
        isElement("violet");
        isElement("rouge");
    }
}
