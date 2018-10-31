/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *Il s'agit d'une classe concrète qui agit comme un panier virtuel pour stocker les articles temporairement.
 * 
 * Il fournit toutes les opérations requises qu'un chariot devrait avoir, telles que:
 * ajouter au panier()
 * removeFromCart ()
 * getProduct ()
 * 
 * Il gère également une liste cartItems avec un type Produit, similaire à la liste de produits dans la classe de produits.
 * 
 * CartItems list a pour stocker l'article acheté dans le panier ou de le retirer du panier. Il conserve simplement la liste des articles ajoutés au panier par l'utilisateur.
 * @author vanessa
 */
class Cart {
    
    List<Produit> cartItems = new ArrayList<>();
    
    /**
     *Cette méthode permet d'ajouter un produit au panier à partir de son ID
     * @param pid
     */
    public void addProductToCartByPID(int pid) {
        
        addToCart(getProductByProductID(pid));
    }
    
    /**
     *Cette méthode permet d'obtenir un produit via son ID
     * @param pid
     * @return
     */
    private Produit getProductByProductID(int pid) {
        
        Produits produits = new Produits();
        List<Produit> products = produits.getProducts();
        
        return products.get(pid);
    }
    
    /**
     *Cette méthode permet d'ajouter un produit au panier.
     * @param product
     */
    private void addToCart(Produit product) {
        cartItems.add(product);
    }
    
    /**
     *Cette méthode permet de supprimer un produit du panier en utilisant son id.
     * @param pid
     */
    public void removeProductByPID(int pid) {
        cartItems.remove(pid);
    }
    
    /**
     *Cette méthode permet d'afficher les produits du panier.
     */
    void printCartItems() {
        
        ListIterator<Produit> iterateur = cartItems.listIterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }
        
    }
    
}
