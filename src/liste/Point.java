/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author vanessa
 */
public class Point implements Comparable<Point> {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point getInvertedPoint() {
        
        //inversion de coordonnées
        return new Point(y, x);

    }

    @Override
    public String toString() {
        return String.format("%d,%d", x, y);
    }
    
    

    @Override
    public int compareTo(Point other) {
        if (other == null) return 1;
        if (this.x < other.x) return -1;
        if (this.x > other.x) return 1;
        //now the x values are equal
        if (this.y < other.y) return -1;
        if (this.y > other.y) return 1;
        return 0;//the points are equal
    }

    //créons une liste et trions la
    public static void main(String[] args) {
        
        List<Point> liste = new ArrayList<>();
        liste.add(new Point(1,2));
        liste.add(new Point(0,1));
        liste.add(new Point(7,0));
        //réordonner
        Collections.sort(liste);
        System.out.println(liste);

    }


}
