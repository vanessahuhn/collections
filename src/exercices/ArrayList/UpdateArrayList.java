/*
 * 5. Ecrire un programme Java pour mettre à jour un élément spécifique par élément donné.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author vanessa
 */
public class UpdateArrayList {
    
    public static void main(String[] args) {
    
        ArrayList<String> liste = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
        
        ListIterator<String> iterateur = liste.listIterator();

        while (iterateur.hasNext()) {
            String couleur = (String) iterateur.next();
            if (couleur == "jaune"){
                int index = liste.indexOf(couleur);
                liste.add(index, "vert");
                liste.remove(index + 1);
            }
            System.out.println(couleur);
        }
        
        ListIterator<String> iterateur2 = liste.listIterator();

        while (iterateur2.hasNext()) {
            System.out.println(iterateur2.next());
        }
    
    }
    
}
