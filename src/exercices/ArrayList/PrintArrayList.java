/*
19. Ecrire un programme Java pour imprimer tous les éléments d’une ArrayList en utilisant la position des éléments.
 */
package exercices.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanessa
 */
public class PrintArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<String> liste = new ArrayList<>();

        liste.add("rouge");
        liste.add("bleu");
        liste.add("jaune");
    
        for (int i = 0; i < liste.size(); i++){
            System.out.println(liste.get(i));
        }
        /*
        for (String couleur : liste)
            System.out.println(couleur);
        */
    }
    
}
