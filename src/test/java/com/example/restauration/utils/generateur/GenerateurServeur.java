package com.example.restauration.utils.generateur;

import com.example.restauration.modele.Serveur;
import com.example.restauration.utils.Builder.ServeurBuilder;

import java.util.ArrayList;
import java.util.List;


public class GenerateurServeur {
    List<Serveur> serveurs = new ArrayList<Serveur>();
    public List<Serveur>generate(int nombre){
        for(int i = 0; i< nombre ; i++){
            this.serveurs.add(new ServeurBuilder().build());
        }
        return this.serveurs;
    }
}
