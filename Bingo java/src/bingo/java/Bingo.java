package bingo.java;

import static java.awt.PageAttributes.MediaType.B;
import java.util.ArrayList;

public class Bingo {
    
      ArrayList Lb = new ArrayList();
      ArrayList Li = new ArrayList();
      ArrayList Ln = new ArrayList();
      ArrayList Lg = new ArrayList();
      ArrayList Lo = new ArrayList();
    
    public void ilistas(){
     this.Lb.add("B");
     this.Li.add("I");
     this.Ln.add("N");
     this.Lg.add("G");
     this.Lo.add("O");
    }
    public void mcartillas(){
     
     System.out.println("----------------------");
     for(int i = 0; i<this.Lb.size();i++){
     System.out.println(" | " + this.Lb.get(i)+ " |" + this.Li.get(i)+ " | " + this.Ln.get(i)+ " | " + this.Lg.get(i)+ " | " + this.Lo.get(i)+ " |");
     System.out.println("----------------------");
     }  
    }
    public static void main(String[] args){
     Bingo bn = new Bingo();
     bn.ilistas();
     bn.mcartillas();
     
        System.out.println("B       I        N       G     O");
    }
}
    
        
      
 