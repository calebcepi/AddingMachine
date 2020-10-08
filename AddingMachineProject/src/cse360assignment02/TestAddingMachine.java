package cse360assignment02;

public class TestAddingMachine {
//A simple program to test our adding machine.
	public static void main(String[] args) {
		AddingMachine am = new AddingMachine();
		
		System.out.println("Should be 0: " + am.getTotal());
		am.add(4);
		System.out.println("Should be 4: " + am.getTotal());
		System.out.println("Should be 0 + 4: " + am.toString());
		am.add(4);
		System.out.println("Should be 8: " + am.getTotal());
		System.out.println("Should be 0 + 4 + 4: " + am.toString());
		am.subtract(4);
		System.out.println("Should be 4: " + am.getTotal());
		System.out.println("Should be 0 + 4 + 4 - 4: " + am.toString());
		am.clear();
		System.out.println("Should be 0: " + am.getTotal());
		System.out.println("Should be 0: " + am.toString());
		

	}

}
