/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.memory;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Giocatore {
    Scanner cin = new Scanner(System.in);

    Carta scopreUnaCartaDelMazzo(Mazzo mazzo) {
    System.out.print("che carta vuoi scoprire?");//chiedo all'utente un numeor da 0 a 9'
    int indice=cin.nextInt(); 
    mazzo.carte[indice].scopri();
    mazzo.stampa();
    mazzo.stampanum();
    return mazzo.carte[indice];
    }

    void togliDalGioco(Carta cartaa, Carta cartab) {
        cartaa.togli();
        cartab.togli();
       
    }

    void copri(Carta cartaa, Carta cartab) {
        cartaa.cartaCoperta=true;
        cartab.cartaCoperta=true;
       
        
    }
    
}
