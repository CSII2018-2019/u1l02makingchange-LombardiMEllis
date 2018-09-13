import javax.swing.JOptionPane;

public class U1L02MakingChange {

	public static void main(String[] args) {
		/* USING A LOOP
		 
		// define variables for amounts of each coin
		int nickels = 0;
		int pennies = 0;
		
		//get input from user (change to usable value)
		String answer = JOptionPane.showInputDialog("Enter a monetary value (ex: 1.56): ");
		double cash = Double.parseDouble(answer);
		pennies = (int)(cash * 100);
		//System.out.println(pennies);
		
		//loop subtracting coin amount until money < coin amount
		while (pennies > 5) {
			nickels++;
			pennies -= 5;
		}
		
		//pennies = money * 100 <--don't need b/c converted to integer value
		
		//print answer
		JOptionPane.showMessageDialog(null, "$" + cash + " is "
				+ nickels + " nickels and "
				+ pennies + " pennies.");
		*/
		
		
		
		//MATHEMATICAL METHOD
		
		//get input from user
		String answer = JOptionPane.showInputDialog("Enter a monetary value (ex: 1.56): ");
		double cash = Double.parseDouble(answer);
		System.out.println(cash);
		
		//divide by 5 and round down
		int nickels = (int)(cash/0.05);
		//System.out.println(nickels);
		
		//subtract # of nickels times 5 from amount to get pennies
		int pennies = (int) ((cash - (.05 * nickels)) * 100);
		
		//print answer
		JOptionPane.showMessageDialog(null, "$" + cash + " is "
				+ nickels + " nickels and "
				+ pennies + " pennies.");
	}

}
