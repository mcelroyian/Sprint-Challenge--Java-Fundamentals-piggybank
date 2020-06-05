package piggy;

public class Dime extends Money
{
	public Dime(int amount)
	{
		super(amount);
		name = "Dime";
		value = 0.10;
	}

	public Dime()
	{
		name = "Dime";
		value = 0.10;
	}
}