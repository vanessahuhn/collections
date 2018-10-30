/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vanessa
 */
public class ListeConversion {

    public static void main(String[] args) {

        //instanciation de la liste
        List<String> liste = Arrays.asList("element");

        System.out.println(liste);

        //list.add("foobar"); //will throw an exception since the list is backed by the array (the size of the list is not modifiable)
        liste.set(0, "foobar");//will work if the args array has at least one element, the list is mutable

        System.out.println(liste);

        //instanciation d'une seconde liste
        List<Integer> liste2 = new ArrayList<>();

        //ajout d'entiers à la liste
        liste2.add(0);
        liste2.add(1);
        liste2.add(2);
        liste2.add(4);

        System.out.println(liste2);

        //conversion de la liste en tableau d'objets
        Object[] elements = liste2.toArray();
        System.out.println(liste2);

        //la méthode toArray() a instancié un tableau d'objets sans type particulier
        //il est nécessaire d'instancier un tableau de type Integer dans la méthode pour avoir un tableau de type Integer uniquement
        Integer[] typedElements = liste2.toArray(new Integer[elements.length]);

        // on imprime le tableau d'objets       
        System.out.println("elements = " + elements + "," + Arrays.toString(elements));
        // on imprime le tableau d'entiers
        System.out.println("typedElements = " + typedElements + "," + Arrays.toString(typedElements));

    }

}
