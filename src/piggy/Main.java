package piggy;

import java.util.*;
public class Main
{

	private static List<Money> bank = new ArrayList<>();


	public static void main(String[] args)
	{
		System.out.println("running");
		// Dollar dollar = new Dollar();
		// Quarter quarter = new Quarter();
		// Dime dime = new Dime();
		// Nickel nickel = new Nickel(10);
		// Penny penny = new Penny();

		//System.out.println("5 Pennies are worth " + penny.save(5));
		bank.add(new Nickel(10));
		bank.add(new Penny(43));
		bank.forEach( m -> System.out.println(m.toString()));
	}
}