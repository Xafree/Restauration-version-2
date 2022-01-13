package com.example.restauration.utils.generateur;

import com.example.restauration.modele.Restaurant;
import com.example.restauration.utils.Builder.RestaurantBuilder;
import java.util.ArrayList;
import java.util.List;

public class GenerateurRestaurant {

    private List<Restaurant> restaurants = new ArrayList<Restaurant>();

    public List<Restaurant> generate(int nombre){
        for (int i = 0 ; i < nombre; i++){
            restaurants.add(new RestaurantBuilder().build());
        }
        return this.restaurants;
    }
}
