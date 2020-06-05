package piggy;

public class Penny extends Money
{
	public Penny(int amount)
	{
		super(amount);
		name = "Penny";
		value = 0.01;
	}
	
	public Penny()
	{
		name = "Penny";
		value = 0.01;
	}

	@Override public String toString()
	{
		return (amount == 1) ? "1 Penny" : amount + " Pennies";
	}
}