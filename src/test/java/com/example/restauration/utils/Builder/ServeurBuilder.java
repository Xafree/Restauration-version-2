package com.example.restauration.utils.Builder;

import com.example.restauration.modele.Serveur;

public class ServeurBuilder {

    public Serveur build(){
        return new Serveur();
    }

    public Serveur buildAvecCommandes(int nombre){
      Serveur serveur = this.build();
      CommandeBuilder commandeBuilder = new CommandeBuilder();
      for(int i = 0; i < nombre; i++){
          serveur.prendreCommande(commandeBuilder.build());
      }
      return serveur;
    }
}
