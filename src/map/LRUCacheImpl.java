/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.Map;

/**
 *
 * @author vanessa
 */
public class LRUCacheImpl<Cle, Valeur> implements LRUCache<Cle, Valeur> {

    private int capacity;
    private LinkedHashMap<Cle, Valeur> map = new LinkedHashMap<>();
    private int missCounter = 0;

    public LRUCacheImpl(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public Valeur get(Cle cle, Function<Cle, Valeur> computer) {
        Valeur result = map.remove(cle);//remove from the map
        if (result == null) {
            result = computer.apply(cle);
            missCounter++;
        }

        map.put(cle, result); // put in the map (key will now be in last position in the LinkedHashMap)

        // check if we are in over-capacity
        //in this case we remove the first element of the map
        int toRemove = map.size() - capacity;
        if (toRemove > 0) {
            for (Iterator<Map.Entry<Cle, Valeur>> it = map.entrySet().iterator(); it.hasNext() && toRemove > 0;) {
                it.next();
                it.remove();
                toRemove--;
            }
        }
        return result;
    }

    @Override
    public int getMisses() {
        return missCounter;
    }

}
