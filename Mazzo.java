/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.memory;


/**
 *
 * @author Admin
 */
class Mazzo {

    Carta[] carte = new Carta[10];
    int ncarte=10;

    public Mazzo() {
    carte[0]=new Carta("A");
    carte[1]=new Carta("B");
    carte[2]=new Carta("C");
    carte[3]=new Carta("D");
    carte[4]=new Carta("E");
    carte[5]=new Carta("A");
    carte[6]=new Carta("B");
    carte[7]=new Carta("C");
    carte[8]=new Carta("D");
    carte[9]=new Carta("E");
   
    stampa();
    stampanum();
    }
  
    
           
  public boolean isNotFinito() {
     return ncarte > 0;
  }
  
    
   

    void stampa() {
        for(int i=0;  i < 10; i++){
            if(carte[i].isCoperta())
                    System.out.print("X");   
            else if(carte[i].cartaNonInGioco)
                     System.out.print(" ");
            
            else    System.out.print (carte[i].getValore());
        }
        System.out.println();
    }

    void stampanum() {
         for(int i=0;  i < 10; i++){
             if(carte[i].isCoperta())
                    System.out.print(i);   
            else  System.out.print(" ");
                    
         }
     System.out.println();  
    }

   void contaCarte() {
        this.ncarte--;
        this.ncarte--;
        
       }
    



}
    


    

    
