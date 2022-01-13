package com.example.restauration.utils.Builder;

import com.example.restauration.modele.Restaurant;
import com.example.restauration.modele.Serveur;

import java.util.ArrayList;
import java.util.List;

public class RestaurantBuilder {
    Restaurant restaurant = new Restaurant();
    ServeurBuilder serveurBuilder = new ServeurBuilder();

    public Restaurant build() {
        return restaurant;
    }

    public RestaurantBuilder ajouterServeurs(int nombreServeurs) {
        List<Serveur> serveurs = new ArrayList<>();
        for (int i = 0 ; i < nombreServeurs ; i++) {
            serveurs.add(serveurBuilder.build());
        }
        if(serveurs.size() != 0){
            for(Serveur s : serveurs) {
                this.restaurant.addServeur(s);
            }
        }
        return this;
    }

    public RestaurantBuilder ajouterServeursAvecCommandes(int nombreServeurs, int nombreCommande) {
        List<Serveur> serveurs = new ArrayList<>();
        for (int i = 0 ; i < nombreServeurs ; i++) {
            serveurs.add(serveurBuilder.buildAvecCommandes(nombreCommande));
        }
        if(serveurs.size() != 0){
            for(Serveur s : serveurs) {
                this.restaurant.addServeur(s);
            }
        }
        return this;
    }
}
