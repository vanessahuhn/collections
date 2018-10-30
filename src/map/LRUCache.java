/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import java.util.function.Function;

/**
 *
 * @author vanessa
 * Interface for a cache map that keeps the Least Recently Used entries
 */
public interface LRUCache<Cle, Valeur> {
    //get the value linked to key or insert it in the cache by computing it with the computer
    public Valeur get(Cle cle, Function<Cle, Valeur> computer);
    
    //number of values that has been computed
    public int getMisses();
}
