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
		System.out.println(printTotal());

		//Stretch

		//convert arraylist to hashmap key is object type : Key? total? number of entries? value?
		Map<String, Integer> ledger = new HashMap<>();
		for (Money m : bank)
		{
			if(ledger.get(m.getName()) != null)
			{
				ledger.put(m.getName(), (ledger.get(m.getName()) + m.getAmount()));
			} else 
			{
				ledger.put(m.getName(), m.getAmount());
			}
		}

		for (HashMap.Entry entry : ledger.entrySet())
        {
        	System.out.print(entry.getKey());
        	System.out.println(" : " + entry.getValue());
        } //End of printing hash
        // double test = 1.5 % 1;
        // double test2 = .80 / 1;
        // System.out.println("Remainder is: " + test);
        // System.out.println("Remainder is: " + (int)test2);

		//creaete inbetween state. ArrayList?
		//Starting from Dollar > Quarter > Dime > Nickel > Penny attempt to
		//subtract as many units as possible if not move to next
		//if the desired amount is reached in inbetween, subtract from hashmap
		//clear in between state

		ledger = raidPiggy(ledger, 1.50);
		System.out.println("PiggyBank after taking 1.50: ");
		for (HashMap.Entry entry : ledger.entrySet())
        {
        	System.out.print(entry.getKey());
        	System.out.println(" : " + entry.getValue());
        } 
        // System.out.println(printMapTotal());

        ledger = raidPiggy(ledger, .29);
		System.out.println("PiggyBank after taking 0.29: ");
		for (HashMap.Entry entry : ledger.entrySet())
        {
        	System.out.print(entry.getKey());
        	System.out.println(" : " + entry.getValue());
        } 
        // System.out.println(printMapTotal());
		//
	}

	public static Map<String, Integer> raidPiggy(Map<String, Integer> pot, double amount)
	{
		Map<String, Integer> hand = new HashMap<>();
		hand.put("Quarter", 0);
		hand.put("Dollar", 0);
		hand.put("Dime", 0);
		hand.put("Nickel", 0);
		hand.put("Penny", 0);


		if (pot.get("Dollar") != 0 && amount / 1 > 1) {
			hand.put("Dollar", (int)(amount / 1));
		}
		if (pot.get("Quarter") != 0 && amount / 1 > 1) {
			hand.put("Quarter", (int)(amount / 1));
		}
		if (pot.get("Dime") != 0 && amount / 1 > 1) {
			hand.put("Dime", (int)(amount / 1));
		}
		if (pot.get("Nickel") != 0 && amount / 1 > 1) {
			hand.put("Nickel", (int)(amount / 1));
		}
		if (pot.get("Penny") != 0 && amount / 1 > 1) {
			hand.put("Penny", (int)(amount / 1));
		}

		pot.put("Dollar", pot.get("Dollar") - hand.get("Dollar"));
		pot.put("Quarter", pot.get("Quarter") - hand.get("Quarter"));
		pot.put("Dime", pot.get("Dime") - hand.get("Dime"));
		pot.put("Nickel", pot.get("Nickel") - hand.get("Nickel"));
		pot.put("Penny", pot.get("Penny") - hand.get("Penny"));
		return pot;
	}

	public static String printTotal()
	{
		double total = 0;
		for (Money m : bank)
		{
			total += m.getTotal();
		}
		return "The total of piggy bank is: $" + total;
	}

	// public static String printMapTotal(Map<)
	// {
	// 	double total = 0;
	// 	total += ledger.get("Dollar");
	// 	total += ledger.get("Quarter");
	// 	total += ledger.get("Dime");
	// 	total += ledger.get("Nickel");
	// 	total += ledger.get("Penny");
	// 	return "The total of piggy bank is: $" + total;
	// }
}