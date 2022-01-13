package com.example.restauration.test_recette;

import com.example.restauration.modele.Commande;
import com.example.restauration.modele.Franchise;
import com.example.restauration.modele.Restaurant;
import com.example.restauration.modele.Serveur;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FranchiseTest {

    @Test
    public void franchiseAvecAucunRestaurant(){
        Franchise franchise = new Franchise();

        float result = 0;

        Assertions.assertEquals(result, franchise.getChiffreAffaire());
    }

    @Test
    public void franchiseAvecUnRestaurantEtUnServeurEtUneCommande(){
        Franchise franchise = new Franchise();
        Restaurant restaurant = new Restaurant();
        Serveur serveur = new Serveur();
        Commande commande = new Commande(5F);

        serveur.prendreCommande(commande);
        restaurant.addServeur(serveur);
        franchise.ajouterRestaurant(restaurant);
        float result = 5;

        Assertions.assertEquals(result, franchise.getChiffreAffaire());
    }

    @Test
    public void franchiseAvecDeuxRestaurantDeuxServeurDeuxCommande(){
        Franchise franchise = new Franchise();
        Restaurant restaurant1 = new Restaurant();
        Restaurant restaurant2 = new Restaurant();
        Serveur serveur1 = new Serveur();
        Serveur serveur2 = new Serveur();

        franchise.ajouterRestaurant(restaurant1);
        franchise.ajouterRestaurant(restaurant2);
        float result = 0;

        Assertions.assertEquals(result, franchise.getChiffreAffaire());
    }
}