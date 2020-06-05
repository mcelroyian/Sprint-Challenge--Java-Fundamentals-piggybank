package piggy;

public class Dollar extends Money
{
	public Dollar(int amount)
	{
		super(amount);
		name = "Dollar";
		value = 1.00;
	}

	public Dollar()
	{
		name = "Dollar";
		value = 1.00;
	}

	@Override public String toString()
	{
		return "$" + amount;
	}
}