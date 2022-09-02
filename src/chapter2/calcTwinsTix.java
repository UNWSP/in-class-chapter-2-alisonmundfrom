package chapter2;

import javax.swing.JOptionPane;

public class calcTwinsTix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string input = JOptionPane.showInputDialog(null, "Please enter the number of tickets: ");
		
		final int TICKET_PRICE = 75;
		final int PROCESSING_FEE = 20;
		final double SALES_TAX = .07;
		
		int sum1 = TICKET_PRICE * input;
		int sum2 = sum1 + PROCESSING_FEE;
		int sum3 = sum2 * SALES_TAX;
		int total = sum2 + sum3;
		
		System.out.println = total
		
				
	}

}
