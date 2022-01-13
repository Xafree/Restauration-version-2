package com.example.restauration.test_recette;
import com.example.restauration.modele.Commande;
import com.example.restauration.modele.Restaurant;
import com.example.restauration.modele.Serveur;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;



public class RestaurantTest {
    @Test
    public void calculChiffreAffaireRestaurant() {
        float montantCommande = 5F;
        Restaurant restaurant = new Restaurant();
        Serveur serveur1 = new Serveur();
        Serveur serveur2 = new Serveur();
        serveur1.prendreCommande(new Commande(montantCommande));
        serveur2.prendreCommande(new Commande(montantCommande));
        restaurant.addServeur(serveur1);
        restaurant.addServeur(serveur2);
        Assertions.assertEquals(2 * montantCommande, restaurant.getChiffreAffaire());
    }
}
