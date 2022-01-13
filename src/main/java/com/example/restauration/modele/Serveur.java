package com.example.restauration.modele;

import java.util.ArrayList;
import java.util.List;

public class Serveur {

    private int chiffreAffaire;
    private List<Commande> commandes = new ArrayList<Commande>();

    public Serveur(){
        this.chiffreAffaire = 0;
    }

    public int getChiffreAffaire() {
        return this.chiffreAffaire;
    }

    public void prendreCommande(Commande commande) {
        this.commandes.add(commande);
        this.chiffreAffaire += commande.getPrix();
    }
}
