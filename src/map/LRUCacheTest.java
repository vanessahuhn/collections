/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

/**
 *
 * @author vanessa
 */
public class LRUCacheTest {
    
    public static void main(String[] args) {
    
        LRUCacheImpl<Integer, Integer> cache = new LRUCacheImpl<>(5);
        for (int i = 0; i < 100; i++)
            System.out.println(cache.get(i, x -> x * x));
        for (int i = 0; i >= 0; i--)
            System.out.println(cache.get(i, x -> x * x));
        System.out.println("Number of misses: " + cache.getMisses());
    }
    
}
