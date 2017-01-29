# This program is about converting letters in Ascii by using a java program.
----
> This is my first program and it will be used at template for further repository. The code is basic, and it will be improve to show a more complet program. It was made in intership as the first approach of coding exemple in object-concept method.

----

## Usage :

> This program is under construction, at the end it will prompt letters to the user and then convert it to Ascii. Then the program will return the converted characters on a single line.

----

## Program presentation:
	
> Here we will describe the program. The user comes through internet on the web site and then files an input box with his chosen letters and then click on a button-box to convert them in the Ascii font.

----

## Code description:

>Here we will introduce all class and interface from the program.


**AbstractFont:**


>

    package font;
    public abstract class AbstractFont 
    {
        protected byte lineHeight;
        protected CaracterInterface[] caracter;
        protected abstract void initLineHeight();
        protected abstract CaracterInterface createCaracter ( char caracter);
        protected  AbstractFont()
        {
            this.initLineHeight();
		this.caracter = new CaracterInterface[255];
        }
	     public byte getLineHeight()
	    {
		return this.lineHeight;
	    }
	    public CaracterInterface getCaracter(char caracter)
	    {
		if (null == this.caracter[caracter]){
		    this.caracter[caracter] = this.createCaracter(caracter);
		}
		return this.caracter[caracter];
	    }
    }


	
*It's an abstract class used in the package Font for declarating two protected attributes. This class declare also two protected methods and three publics.*

 *The first attributes is a variable call lineHeight with byte type and the second is caracter an array with CaracterInterface type.*

*The two first protected methods are here for initializing the value of lineHeight and the value of the CaracterInterface array.*


**FontInterface:**


>

    package font;
    public interface FontInterface 
    {
	    public byte getLineHeight();
	    public CaracterInterface getCaracter(char character);	
    }

	
*Interface used in the package Font for declarating two publics methods. One to get the line height of the letter and another one to get the template of the character in Ascii corresponding to the choice of the user.*


**CaracterInterface:**


>

    package font;
    public interface CaracterInterface 
    {
	
	public String toString();
	public char[][] toAscii();

    }

	
*Interface used in the package Font for declarating two publics methods. One to get the string of caracter input by the user and another one to get the template of the character.*





----
## changelog
* 17-Feb-2013 re-design

----
## thanks
 
* Cyril Itchi our tutor
