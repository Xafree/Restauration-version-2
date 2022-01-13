package com.example.restauration.test_recette;

import com.example.restauration.modele.Commande;
import com.example.restauration.modele.Serveur;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServeurTest {

    @Test
    public void ChiffreAffaireAZero(){
        Serveur serveur = new Serveur();

        int result = 0;
        Assertions.assertEquals(result,serveur.getChiffreAffaire());
    }

    @Test
    public void ChiffreAffaireEstLeMontantDeLaCommande(){
        //initialisation
        Serveur serveur = new Serveur();
        Commande commande = new Commande(5F);

        serveur.prendreCommande(commande);
        int result = 5;

        Assertions.assertEquals(result, serveur.getChiffreAffaire());
    }

    @Test
    public void ChiffreAffairePlusieursCommande(){
        Serveur serveur = new Serveur();
        Commande commande1 = new Commande(5F);
        Commande commande2 = new Commande(5F);

        serveur.prendreCommande(commande1);
        serveur.prendreCommande(commande2);
        int result = 10;

        Assertions.assertEquals(result,serveur.getChiffreAffaire());
    }
}