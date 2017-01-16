package ascii.big;

import ascii.AbstractFont;
import ascii.FontInterface;
import font.CaracterInterface;

public class Big extends AbstractFont implements FontInterface
{

    public Big()
    {
        super();
        char[] foo = {
          '|', '_', '\\', '/', '(', ')'
        };
        this.symbol = foo;
    }

    protected void initLineHeight()
    {
        this.lineHeight = 6;
    }

    protected void initSymbolDefault()
    {
        this.symbolDefault = ' ';
    }

    protected CaracterInterface createCaracter(char caracter)
    {
        return new C(this);
//        if ('C'== caracter ){
//            return new C(this);
//        } else if ('J' == caracter){
//            return new J(this);
//        }
//    

    }

    protected void initSymbol()
    {

        this.symbol = new char[10]; // 10 est le nombre de caractères de la typo
                                    // big
    }

}
