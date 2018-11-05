/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.shoppingcart;

import java.util.ArrayList;
import java.util.List;

/**
 * Le rôle de cette classe dans votre application est de vous fournir les
 * produits du magasin. En d'autres termes, cette classe est utilisée pour
 * initialiser votre magasin dès le démarrage de l'application. En application
 * réelle, les éléments seront extraits de la session utilisateur ou de la base
 * de données. Pour plus de simplicité, on utilise la classe Produits pour
 * initialiser des objets.
 *
 * Créer une méthode getProducts pour retourner une liste de type Produit.
 *
 * Créer une méthode initStoreItems () qui vous permet d’ajouter les produits
 * dans une nouvelle ArrayList de type Produit.
 *
 * @author vanessa
 */
public class Produits {

    private final List<Produit> products = new ArrayList<>();

    public Produits() {
        this.initStoreItems();
    }

    /**
     * Créer une méthode getProducts pour retourner une liste de type Produit.
     *
     * @return products
     */
    public List<Produit> getProducts() {

        return products;

    }

    /**
     * Créer une méthode initStoreItems () qui vous permet d’ajouter les
     * produits dans une nouvelle ArrayList de type Produit.
     */
    public void initStoreItems() {

        Produit produit1 = new Produit(1, "chaussures", 44.99, 15);
        Produit produit2 = new Produit(2, "pantalon", 59.99, 20);
        Produit produit3 = new Produit(3, "veste", 69.99, 5);
        Produit produit4 = new Produit(4, "culotte", 9.99, 10);

        products.add(produit1);
        products.add(produit2);
        products.add(produit3);
        products.add(produit4);
    }

}
