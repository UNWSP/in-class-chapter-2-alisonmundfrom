package chapter2;

public class Scope {
	final int WOOD = 0;
	static int grass = 0;
	public int water = 0; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("initial grass value: " + grass); 
		
		grass = grass + 50;
		
		System.out.println("secondary grass value: " + grass);
		
		{ 
			int water = 45;
		
			System.out.println("initial water value: " + water);
		}
	}

}
