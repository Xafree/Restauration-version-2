package com.example.restauration.modele;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<Serveur> serveurs = new ArrayList<>();
    private float chiffreAffaire;

    public Restaurant(){
        this.chiffreAffaire = 0;
    }

    public void addServeur(Serveur serveur){
        this.serveurs.add(serveur);
        this.chiffreAffaire += serveur.getChiffreAffaire();
    }

    public List<Serveur> getServeurs() {
        return this.serveurs;
    }

    public float getChiffreAffaire() {
        return this.chiffreAffaire;
    }

}
