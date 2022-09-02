package chapter2;

import javax.swing.JOptionPane;

public class CalculateTwinsTix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number_tix_int;
		final int PRICE = 75;
		final int FEE = 20;
		final double TAX_RATE = .07;
		double taxAmt;
		double subtotal;
		double total;
		double ticket_total;
		String ticket_total_str;
		
		String number_tix_str = JOptionPane.showInputDialog("Enter the number of tickets: ");
		number_tix_int = Integer.parseInt(number_tix_str);
		ticket_total = number_tix_int * PRICE;
		subtotal = ticket_total + FEE;
		taxAmt = subtotal * TAX_RATE;
		ticket_total = subtotal + taxAmt;
		ticket_total_str = String.format("%.2f", ticket_total);
		
		JOptionPane.showMessageDialog(null, "Total: $" + ticket_total_str);
	}

}
