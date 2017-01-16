package ascii;

public abstract class AbstractFont extends font.AbstractFont 
{

	protected char symbolDefault;

	protected char[] symbol;

	protected abstract void initSymbolDefault();

	protected abstract void initSymbol();

	protected AbstractFont()
	{
		super();// appelle du parent
		this.initSymbolDefault();

	}

	public char getSymbolDefault()
	{
		return this.symbolDefault;
	}

	public char[] getSymbol()
	{

		return this.symbol;

	}

}
