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
 * Il s'agit d'une classe concrète qui agit comme un panier virtuel pour stocker
 * les articles temporairement.
 *
 * Il fournit toutes les opérations requises qu'un chariot devrait avoir, telles
 * que: ajouter au panier() removeFromCart () getProduct ()
 *
 * Il gère également une liste cartItems avec un type Produit, similaire à la
 * liste de produits dans la classe de produits.
 *
 * CartItems list a pour stocker l'article acheté dans le panier ou de le
 * retirer du panier. Il conserve simplement la liste des articles ajoutés au
 * panier par l'utilisateur.
 *
 * @author vanessa
 */
class Cart {

    List<Produit> cartItems = new ArrayList<>();

    /**
     * Cette méthode permet d'ajouter un produit au panier à partir de son ID
     *
     * @param pid
     */
    public void addProductToCartByPID(int pid, Produits produits) {

        addToCart(getProductByProductID(pid, produits));
        getProductByProductID(pid, produits).setStock(getProductByProductID(pid, produits).getStock() - 1);

    }

    /**
     * Cette méthode permet d'obtenir un produit via son ID
     *
     * @param pid
     * @return
     */
    private Produit getProductByProductID(int pid, Produits produits) {

        List<Produit> products = produits.getProducts();

        return products.get(pid);
    }

    /**
     * Cette méthode permet d'ajouter un produit au panier.
     *
     * @param product
     */
    private void addToCart(Produit product) {
        cartItems.add(product);
    }

    /**
     * Cette méthode permet de supprimer un produit du panier en utilisant son
     * id.
     *
     * @param pid
     */
    public void removeProductByPID(int pid, Produits produits) {

        //l'item se remove en fonction de son id dans la liste, cela ne permet pas de remettre le stock
        Produit produit = cartItems.get(pid);
        cartItems.remove(pid);
        
        String nom = produit.getName();
        switch (nom) {
            case "chaussures":
                pid = 1;
                System.out.println("Les chaussures ont été retirées du panier");
                break;
            case "pantalon":
                pid = 2;
                System.out.println("Le pantalon a été retiré du panier");
                break;
            case "veste":
                pid = 3;
                System.out.println("La veste a été retirée du panier");
                break;
            case "culotte":
                pid = 4;
                System.out.println("La culotte a été retirée du panier");
                break;
        }

        produit.setStock(produit.getStock() + 1);

    }

    /**
     * Cette méthode permet d'afficher les produits du panier.
     */
    void printCartItems() {

        ListIterator<Produit> iterateur = cartItems.listIterator();

        while (iterateur.hasNext()) {
            int i = 1;
            Produit item;
            System.out.print(i++ + ". ");
            System.out.println(iterateur.next());
        }

    }

}
