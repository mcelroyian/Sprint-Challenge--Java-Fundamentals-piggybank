package piggy;

abstract class Money
{
	protected static int maxId;
	protected String name;
	protected int id;
	protected double value;
	protected int amount;


	public Money()
	{
		id = ++maxId;
		amount = 1;
	}

	public Money(int amount)
	{
		id = ++maxId;
		this.amount = amount;
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

	double getTotal()
	{
		return amount * value;
	}

	int getAmount()
	{
		return amount;
	}

	void setAmount(int amount)
	{
		this.amount = amount;
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