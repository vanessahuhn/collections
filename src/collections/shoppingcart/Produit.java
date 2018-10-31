/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.shoppingcart;

import java.util.Objects;

/**
 * Il s'agit d'une classe qui contient les propriétés du produit et fournit des setters et des getters pour celle-ci.
 * 
 * Créer la méthode equals () : pour comparer deux objets en fonction de leurs propriétés.
 * 
 * Créer la méthode hashCode () : est un hachage / numéro unique attaché à chaque objet chaque fois que l'objet est créé. Donc, chaque fois que deux objets sont comparés.
 * Leur code de hachage et leurs propriétés sont comparés. Si les deux (code de hachage et valeur de propriétés) sont identiques, l'objet est considéré comme égal, sinon différent.
 * Par conséquent, il est très important de faire un override pour les méthodes existantes hashcode () et equals () d'un objet.
 *
 * @author vanessa
 */
public class Produit {

    private Integer pid;

    private String name;

    private Double price;

    private Integer stock;

    public Produit() {
    }

    public Produit(Integer pid, String name, Double price, Integer stock) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.pid);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produit other = (Produit) obj;
        if (!Objects.equals(this.pid, other.pid)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return pid + ".  " + name + "  ||   prix = " + price + "  ||   en stock = " + stock;
    }
    
    

}
