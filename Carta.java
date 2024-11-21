/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.memory;

/**
 *
 * @author Admin
 */
class Carta {
private String valore;
boolean cartaCoperta;
boolean cartaNonInGioco;

    public String getValore() {
        return valore;
    }
    Carta(String A) {
        valore = A;
        cartaCoperta=true;
        cartaNonInGioco=false;
    }
    
     

    boolean isEquals(Carta cartab) {
        return ( this.valore.equals(cartab.valore));
    }

    boolean isCoperta() {
      return cartaCoperta;
    }

    void scopri() {
       cartaCoperta=false;
    }
    
    void togli(){
        this.cartaNonInGioco=true;
 
    }
    
}
