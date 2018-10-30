/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.bagIterateur;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 *
 * @author vanessa
 */
public class BagIterator<T> implements Iterator<T> {

    private Iterator<Map.Entry<T, Integer>> entriesIterator;
    private T currentElement = null;
    private int remainingSamples = 0;

    public BagIterator(Bag<T> bag) {
        this.entriesIterator = bag.content.entrySet().iterator();
        if (entriesIterator.hasNext()) {
            Map.Entry<T, Integer> entry = entriesIterator.next();
            currentElement = entry.getKey();
            remainingSamples = entry.getValue();
        }
    }

    @Override
    public boolean hasNext() {
        return remainingSamples > 0;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        T element = currentElement;

        remainingSamples--;

        if (remainingSamples == 0 && entriesIterator.hasNext()) {

            Map.Entry<T, Integer> entry = entriesIterator.next();

            currentElement = entry.getKey();

            remainingSamples = entry.getValue();

        }

        return element;
    }

}
