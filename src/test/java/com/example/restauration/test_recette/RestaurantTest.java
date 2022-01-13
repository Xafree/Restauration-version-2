package com.example.restauration.test_recette;
import com.example.restauration.modele.Restaurant;
import com.example.restauration.utils.Builder.RestaurantBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestaurantTest {

    @Test
    public void calculChiffreAffaireRestaurant_Cas0Serveurs() {
        RestaurantBuilder restaurantBuilder = new RestaurantBuilder();
        Restaurant restaurant = restaurantBuilder.build();
        Assertions.assertEquals(0, restaurant.getChiffreAffaire());
    }

    @Test
    public void calculChiffreAffaireRestaurant_Cas1Serveurs() {
        RestaurantBuilder restaurantBuilder = new RestaurantBuilder();
        Restaurant restaurant = restaurantBuilder.ajouterServeursAvecCommandes(1, 1).build();
        Assertions.assertEquals(5F, restaurant.getChiffreAffaire());
    }

    @Test
    public void calculChiffreAffaireRestaurant_Cas2Serveurs() {
        RestaurantBuilder restaurantBuilder = new RestaurantBuilder();
        Restaurant restaurant = restaurantBuilder.ajouterServeursAvecCommandes(2, 1).build();
        Assertions.assertEquals(10F, restaurant.getChiffreAffaire());
    }

    @Test
    public void calculChiffreAffaireRestaurant_Cas100Serveurs() {
        RestaurantBuilder restaurantBuilder = new RestaurantBuilder();
        Restaurant restaurant = restaurantBuilder.ajouterServeursAvecCommandes(100, 1).build();
        Assertions.assertEquals(500F, restaurant.getChiffreAffaire());
    }
}
