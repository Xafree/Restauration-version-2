package com.example.restauration.test_recette;

import com.example.restauration.modele.Commande;
import com.example.restauration.modele.Franchise;
import com.example.restauration.modele.Restaurant;
import com.example.restauration.modele.Serveur;
import com.example.restauration.utils.Builder.FranchiseBuilder;
import com.example.restauration.utils.generateur.GenerateurCommande;
import com.example.restauration.utils.generateur.GenerateurRestaurant;
import com.example.restauration.utils.generateur.GenerateurServeur;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        Franchise franchise = new FranchiseBuilder().build();
        List<Restaurant> restaurants = new GenerateurRestaurant().generate(2);
        List<Serveur> serveurs = new GenerateurServeur().generate(2);
        List<Commande> commandes = new GenerateurCommande().generate(2);

        for( int i = 0; i < commandes.size(); i++){
            serveurs.get(i).prendreCommande(commandes.get(i));
            restaurants.get(i).addServeur(serveurs.get(i));
            franchise.ajouterRestaurant(restaurants.get(i));
        }
        float result = 10;

        Assertions.assertEquals(result, franchise.getChiffreAffaire());

    }
}