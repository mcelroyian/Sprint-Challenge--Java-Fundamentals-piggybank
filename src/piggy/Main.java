package piggy;

import java.util.*;
public class Main
{

	private static List<Money> bank = new ArrayList<>();

	public static void main(String[] args)
	{
		System.out.println("***My Piggy Bank");
		bank.add(new Quarter());
		bank.add(new Dime());
		bank.add(new Dollar(5));
		bank.add(new Nickel(3));
		bank.add(new Dime(7));
		bank.add(new Dollar());
		bank.add(new Penny(10));
		bank.forEach( m -> System.out.println(m.toString()));
		//Get Total
		double total = 0;
		for (Money m : bank)
		{
			total += m.getTotal();
		}
		System.out.println("The total of piggy bank is: $" + total);
	}
}