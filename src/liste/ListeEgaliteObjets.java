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
public class ListeEgaliteObjets {

    public int indexOf(String element)
{
	for (int i = 0; i < size(); i++)
	{
		final String a = (String) this.get(i);
		if ((element == null && a == null) || (element != null && element.equals(a)))
				return i;
	}
	return -1;
}

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(1);
        //résultat attendu -1
        System.out.println(liste.indexOf(0));
        //résultat attendu 0
        System.out.println(liste.indexOf(1));
    }

    private Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    private int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
