/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.shoppingcart;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Dans la console, un utilisateur ne peut entrer qu'une seule entrée à la fois.
 * Ceci est le concept clé et pourrait être utilisé pour rendre l'interface
 * utilisateur facile.
 *
 * Dans cette application, on utilise une seule variable de classe pour prendre
 * les entrées de l'utilisateur. Et en fonction de la valeur d'entrée, le
 * processus correspondant sera exécuté.
 *
 * C'est la classe où se déroule l'interaction principale entre l'utilisateur et
 * l'application.
 *
 * C'est le point de contrôle de l'application.
 *
 * Tout ce que vous voyez dans la console est le résultat de cette page.
 *
 * Il utilise les entrées utilisateur et appelle les méthodes respectives à
 * partir des classes que vous avez créées précédemment pour effectuer la tâche
 * requise.
 *
 * @author vanessa
 */
public class UI {

    Cart cart = new Cart();
    private int ch = 0; // choix utilisateur dans le scanner ?

    public UI() {
        menu();
    }

    public void startScreen() {
        System.out.println("1. Display Store Products");
        System.out.println("2. Display Cart");
        System.out.println("0. Exit");
        switch (getUserInput()) {
            case 0:
                ch = 0;
                break;
            case 1:
                ch = 1;
                displayStoreProducts();
            case 2:
                ch = 2;
                showCart();
                menu();
            default:
                System.out.println("Veuillez entrer un chiffre valide");
        }

    }

    public void storeProductsMenu() {
        System.out.println("1. Add to Cart");
        System.out.println("0. Exit");

        switch (getUserInput()) {
            case 0:
                ch = 0;
                System.out.println("Retour à l'accueil.");
                menu();
            case 1:
                ch = 1;
                System.out.println("Ajouter au panier.Veuillez entrer l'id du produit :");
                getUserInput();
                addProductToCart();
                menu();
            default:
                System.out.println("Veuillez entrer un chiffre valide");
        }
    }

    public void cartMenu() {
        System.out.println("1. Remove From Cart");
        System.out.println("0. Exit");

        switch (getUserInput()) {
            case 0:
                ch = 0;
                System.out.println("Retour à l'accueil.");
                menu();
            case 1:
                ch = 1;
                System.out.println("Retirer du panier");
                getUserInput();
                removeProductFromCart();
                menu();
            default:
                System.out.println("Veuillez entrer un chiffre valide");
        }
    }

    public void menu() {

        startScreen();

    }

    /**
     * Cette méthode permet de récupérer le nombre entré par l'utilisateur.
     *
     * @return
     */
    private int getUserInput() throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un chiffre.");
        ch = sc.nextInt();
        return ch;
    }

    /**
     * Cette méthode permet d'afficher la boutique (1 du start screen).
     */
    private void displayStoreProducts() {

        Produits produits = new Produits();

        ListIterator<Produit> iterateur = produits.getProducts().listIterator();

        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

        storeProductsMenu();

    }

    /**
     * Cette méthode permet d'ajouter un produit au panier.
     */
    private void addProductToCart() {

        try {
            cart.addProductToCartByPID(ch - 1);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Veuillez entrer un chiffre valide.");
        }

    }

    /**
     * Cette méthode permet d'afficher le panier.
     */
    private void showCart() {

        cart.printCartItems();

        cartMenu();

    }

    /**
     * Cette méthode permet de retirer un produit du panier.
     */
    private void removeProductFromCart() {

        cart.removeProductByPID(ch - 1);

    }

}