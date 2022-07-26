
public class TestDriver {

	public static void main(String[] args) {

		MyComplex C1 = new MyComplex(2,4);
		MyComplex C2 = new MyComplex(3,7);

		// test set and get for Real and Imag number
		
		System.out.println(C1.getReal());
		System.out.println(C1.getImag()+ "i");
		
		// set Real and set Imag
		C1.setReal(1);
		C1.setImag(3);
		System.out.println(C1.getReal());
		System.out.println(C1.getImag()+ "i");
		
		// set Value (real and Imag)
		C1.setValue(6, 8);
		System.out.println(C1.getReal());
		System.out.println(C1.getImag() + "i");
		
		// print (x+yi)
		System.out.println(C1.toString());
		
		// is Real number
		System.out.println("is real?: " + C1.isReal());
		
		// is Imaginary number
		System.out.println("is Imaginary?: " + C1.isImaginary());
		
		// equals real and imaginary
		System.out.println("is equals?: " + C1.equals(6,8));
		
		//equals another MyComplex
		System.out.println("is equals?: " + C1.equals(C2));
		
		//magnitude
		System.out.println("magnitude: " + C1.magnitude());
		
		//argument
		System.out.println("argument: " + C1.argument());
		
		// test operations => add , subtract , multiply , divide
		System.out.println("add: "  + C1.add(C2));
		System.out.println("subtract: "  + C1.subtract(C2));
		System.out.println("multiply: "  + C1.multiply(C2));
		System.out.println("divide: "  + C1.divide(C2));
		
	}

	
}
