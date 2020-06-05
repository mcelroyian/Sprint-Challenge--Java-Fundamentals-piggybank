package piggy;

abstract class Money
{
	protected static int maxId;
	protected String name;
	protected int id;
	protected double value;
	protected int amount;


	public Money(int amount)
	{
		id = ++maxId;
		this.amount = amount;
	}

	public Money()
	{
		id = ++maxId;
		amount = 1;
	}

	double getValue()
	{
		return value;
	}

	void setValue(double value)
	{
		this.value = value;
	}

	String getName()
	{
		return name;
	}

	public double save(int units)
	{
		return value * units;
	}

	@Override public String toString()
	{
		if (amount == 1)
		{
			return "1 " + name;
		} else
		{
			return amount + " " + name + "s";
		}
	}
}