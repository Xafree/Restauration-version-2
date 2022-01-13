package com.example.restauration.utils.generateur;

import com.example.restauration.modele.Commande;
import com.example.restauration.utils.Builder.CommandeBuilder;

import java.util.ArrayList;
import java.util.List;

public class GenerateurCommande {

    private  List<Commande> commandes = new ArrayList<Commande>();

    public List<Commande> generate (int nombre){
        for(int i = 0 ; i < nombre ; i++){
            commandes.add(new CommandeBuilder().build());
        }
        return this.commandes;
    }
}
