import java.util.Scanner;
public class MyComplexApp {

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		
		//complex number 1
		System.out.println("complex number 1 (real and imaginary part).");
		System.out.print("Enter real number: ");
		double nr1 = in.nextDouble();
		System.out.print("Enter imaginary number: ");
		double ni1 = in.nextDouble(); 
		MyComplex C1 = new MyComplex(nr1,ni1);
		
		//compolex number2
		System.out.println("\ncomplex number 2 (real and imaginary part).");
		System.out.print("Enter real number: ");
		double nr2 = in.nextDouble();
		System.out.print("Enter imaginary number: ");
		double ni2 = in.nextDouble(); 
		MyComplex C2 = new MyComplex(nr2,ni2);
		
		
		 /* ---------------------------- complex number 1 ------------------------------ */
		
		System.out.println("\n-------------------- complex number 1 --------------------\n");
		
		String complex1 = C1.toString();
		
		System.out.println("Number 1 is: " +  complex1);
		if(C1.isReal())
			System.out.println( complex1 + " is a pure real number" );
		else 
			System.out.println( complex1 + " is NOT a pure real number" );
		
		if(C1.isImaginary())
			System.out.println( complex1 + " is a pure imaginary number" );
		else 
			System.out.println( complex1 + " is NOT a pure imaginary number" );
		
		
		System.out.println("magnitude: " + C1.magnitude());
		System.out.println("argument: " + C1.argument());
		
		
		 /* ---------------------------- complex number 2 ------------------------------ */
		
		
		System.out.println("\n-------------------- complex number 2 --------------------\n");
		
		String complex2 = C2.toString();
		
		System.out.println("Number 2 is: " +  complex2);
		if(C2.isReal())
			System.out.println( complex2 + " is a pure real number" );
		else 
			System.out.println( complex2 + " is NOT a pure real number" );
		
		if(C2.isImaginary())
			System.out.println( complex2 + " is a pure imaginary number" );
		else 
			System.out.println( complex2 + " is NOT a pure imaginary number" );
		
		System.out.println("magnitude: " + C2.magnitude());
		System.out.println("argument: " + C2.argument());
		
		// operations (equality , add , subtract , multiply , divide) 
		System.out.println("\n----------------------- operations -----------------------\n");
		// equality
		if(C1.equals(C2))
			System.out.println(complex1 + " is equals " + complex2);
		else 
			System.out.println(complex1 + " is NOT equals " + complex2);
		
		//add
		System.out.println("\n" + C1.toString() + " + " +C2.toString()+ " = " +C1.add(C2));
		
		//subtract
		System.out.println("\n"+C1.toString()+ " - " +C2.toString()+ " = " +C1.subtract(C2));
		
		//multiply
		System.out.println("\n"+C1.toString()+ " * " +C2.toString()+ " = " +C1.multiply(C2));
		
		//divide
		System.out.println("\n"+C1.toString()+ " / " +C2.toString()+ " = " +C1.divide(C2));
		
	}

}
