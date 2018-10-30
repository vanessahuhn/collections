/*
 * En utilisant la classe ArrayList, créer un programme qui :
 * 1. reçoit 20 valeurs numériques réelles de l'utilisateur
 * 2. calcule le nombre de valeurs qui sont supérieures à la moyenne
 */
package liste;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vanessa
 */
public class ExerciceArrayList {
    
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int total = 0;
        double moyenne = 0;
        int count = 0;
        
        while (liste.size() < 20){
            System.out.println("Entrez un nombre : ");
            int nombre = sc.nextInt();
            liste.add(nombre);
            total += nombre;
        }
        
        moyenne = total / liste.size();
        
        for (int i = 0; i < liste.size(); i++){
            if (liste.get(i) > moyenne){
                count++;
            }
        }
        System.out.println(count + " valeurs sont supérieures à la moyenne qui est de " + moyenne);
    }
    
}
