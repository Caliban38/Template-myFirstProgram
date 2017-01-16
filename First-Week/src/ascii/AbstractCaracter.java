package ascii;

public abstract class AbstractCaracter
{
    protected char[][] lettres; // deux dimension

    public char[][] toAscii()
    {
        return this.lettres ;
    }

}
