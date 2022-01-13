package com.example.restauration.modele;

import java.util.ArrayList;
import java.util.List;

public class Franchise {

    private float ChiffreAffaire;
    private List<Restaurant> restaurants = new ArrayList<Restaurant>();

    public Franchise() {
        ChiffreAffaire = 0;
    }

    public float getChiffreAffaire() {
        return this.ChiffreAffaire;
    }

    public void ajouterRestaurant(Restaurant restaurant) {
        this.restaurants.add(restaurant);
        this.ChiffreAffaire += restaurant.getChiffreAffaire();
    }
}
