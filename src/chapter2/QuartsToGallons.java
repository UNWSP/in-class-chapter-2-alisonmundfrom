package chapter2;

import java.util.*;

public class QuartsToGallons {
	
	static final int GALLONSINQUART = 4;

	public static void main(String[] args) throws java.lang.Exception 
	{
		try {
			
		// TODO Auto-generated method stub
		
		int NumberGallons;
		int NumberQuarts;
		int QuartsNeeded;
		  
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the quarts needed: ");
		
		NumberQuarts = input.nextInt();
		
		NumberGallons = NumberQuarts / GALLONSINQUART;
		
		QuartsNeeded = NumberQuarts % GALLONSINQUART;
		
		System.out.println("A job that needs " + NumberQuarts 
				+ " quarts requires " + NumberGallons 
				+ " gallons plus " + QuartsNeeded 
				+ " quarts.");
		
	}catch(Exception ex) {
		return;}
		
		
	}

}
