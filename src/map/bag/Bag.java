/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.bag;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vanessa
 */
public class Bag<T> {
    
    private Map<T, Integer> content;
    
    public Bag() {
        this.content = new HashMap<T, Integer>();
    }
    
    //get the current number of samples of an element
    public int get(T element){
        Integer samples = content.get(element);
        return (samples == null)?0:samples;
    }
    
    //add a new sample of the element and return the current number of samples in the bag
    
    public int add(T element){
        int newSamples = get(element) + 1;
        content.put(element, newSamples);
        return newSamples;
    }
    
    public int remove(T element){
        int newSamples = get(element) - 1;
        switch (newSamples)
        {
            case -1: break;//nothing to do, the element was not present
            case 0: content.remove(element); break;//no more samples
            default: content.put(element, newSamples);
        }
        return Math.max(0, newSamples);
    }
    
    /**
     * We delegate the work to the underlying map
     */
    @Override
    public String toString() {
        return content.toString();
    }

    public static void main(String[] args) {
        // add in the bag all the arguments of the main
        Bag<String> b = new Bag<>();
        for (String arg : args) {
            b.add(arg);
        }
        System.out.println(b);
    }
}
