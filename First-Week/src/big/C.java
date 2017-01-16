package ascii.big;

import ascii.AbstractCaracter;
import ascii.AbstractFont;
import font.CaracterInterface;



public class C extends AbstractCaracter implements CaracterInterface
{

    byte largeur;
    
    public C(AbstractFont font)
    {
       char [] myTransitionalVar = font.getSymbol();
        
        this.lettres = new char [font.getLineHeight()][largeur = 8];
        

               this.lettres[1][7] =
               this.lettres[2][0] =
               this.lettres[2][2] =
               this.lettres[3][0] =
               this.lettres[3][2] =
               this.lettres[4][0] =
               this.lettres[4][2] =
               this.lettres[5][7] = myTransitionalVar[0];
               this.lettres[4][3] =
               this.lettres[5][2] =
               this.lettres[0][2] =
               this.lettres[0][3] =
               this.lettres[0][4] =
               this.lettres[0][5] =
               this.lettres[0][6] =
               this.lettres[1][4] =
               this.lettres[1][5] =
               this.lettres[1][6] =
               this.lettres[4][4] =
               this.lettres[4][5] =
               this.lettres[4][6] =
               this.lettres[5][3] =
               this.lettres[5][4] =
               this.lettres[5][5] =
               this.lettres[5][6] =                                                     
               this.lettres[1][3] = myTransitionalVar[1];
               this.lettres[1][1] = myTransitionalVar[3];
               this.lettres[5][1] = myTransitionalVar[2];
    }

    

    public String toString()
    {
        return "C";
    }

}
