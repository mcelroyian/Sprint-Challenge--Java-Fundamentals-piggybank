package piggy;

public class Nickel extends Money
{
	public Nickel(int amount)
	{
		super(amount);
		name = "Nickel";
		value = 0.05;
	}

	public Nickel()
	{
		name = "Nickel";
		value = 0.05;
	}
}