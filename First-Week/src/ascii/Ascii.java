package ascii;

import ascii.big.Big;
import font.CaracterInterface;

public class Ascii
{
    public static void main(String[] args)
    {
        FontInterface font = new Big();
        CaracterInterface caracter = font.getCaracter('C');
        CaracterInterface[] caracterCollection = new CaracterInterface[1];
        caracterCollection[0] = caracter ;
        
        byte a,b,c;
        
        for (a=0 ; a < font.getLineHeight() ; a++) {
          
            
            for (b=0 ; b < caracterCollection.length; b++) {
                
//                char current = font.getSymbolDefault();
                
                char [][] definition = caracterCollection[b].toAscii();


                for (c=0; c < definition[a].length ; c++) {
                   
//                    if(Character.MIN_VALUE != definition[a][c] && current != definition[a][c]){
//                        
//                        current = definition [a][c];
//                    }
                    
                    System.out.print(definition[a][c]);
                    
                }
      
            }
            System.out.println(""); 
        }
  
        
        
        
       
    }
}
