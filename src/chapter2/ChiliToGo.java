package chapter2;

import java.util.Scanner;

public class ChiliToGo {
	static final int CHILDCOST = 4;
	static final int ADULTCOST = 7;

	public static void main(String[] args) throws java.lang.Exception 
	{
		try {
			
		// TODO Auto-generated method stub
		
		int ChildTix;
		int AdultTix;
		int ChildTixCost;
		int AdultTixCost;
		int TotalTixCost;
		
		Scanner child_input = new Scanner(System.in);
		System.out.print("Enter the number of Child(ren) meal(s): ");
		ChildTix = child_input.nextInt();
		
		Scanner adult_input = new Scanner(System.in);
		System.out.print("Enter the number of Adult meal(s): ");
		AdultTix = adult_input.nextInt();
		
		ChildTixCost = ChildTix * CHILDCOST;
		AdultTixCost = AdultTix * ADULTCOST;
		TotalTixCost = ChildTixCost + AdultTixCost;
		
		System.out.println("Number of child meals: " + ChildTix + "\n" 
				+ "Number of Adult meals: " + AdultTix + "\n"
				+ "Child meals total cost: $" + ChildTixCost + "\n"
				+ "Adult meals total cost: $" + AdultTixCost + "\n"
				+ "Total meals cost: $" + TotalTixCost);
		
		}catch(Exception ex) {
			return;}
		
	}

}
