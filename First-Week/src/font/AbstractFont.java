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
		if (null == this.caracter[caracter])	{this.caracter[caracter] = this.createCaracter(caracter);
			
		}
		return this.caracter[caracter];
	}
}
