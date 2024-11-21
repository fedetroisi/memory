package g.memory;
public class Memory {

    public static void main(String[] args) {
        
    Mazzo mazzo = new Mazzo();
    Giocatore giocatore = new Giocatore();
    while(mazzo.isNotFinito()){
       
       Carta cartaa = giocatore.scopreUnaCartaDelMazzo(mazzo);
       Carta cartab = giocatore.scopreUnaCartaDelMazzo(mazzo);
       if(cartaa.isEquals(cartab)){
        giocatore.togliDalGioco(cartaa,cartab);
        System.out.println("carte rimanti");
        mazzo.contaCarte();
        mazzo.stampa();
        mazzo.stampanum();
    
       }
       else{
        giocatore.copri(cartaa, cartab);
        System.out.println("mi dispiace...");
        mazzo.stampa();
        mazzo.stampanum();
        }
     
        }
     System.out.print("gioco finito");
    }
 
}

    
   

