
public class MyComplex {

	private double real;
	private double imag; // imaginary = imag
	
	public MyComplex() {
		real = 0.0;
		imag = 0.0;
	}
	
	public MyComplex(double real , double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	// get and set real
	public double getReal() {
		return real;
	}
	
	public void setReal(double real) {
		 this.real = real;
	}
	
	// get and set imag
	public double getImag() {
		return imag;
	}
	
	public void setImag(double imag) {
		this.imag = imag;
	}

	//set value for real and imag
	public void setValue(double real , double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	// toString ; "(real+imagi)" => "(3+4i)"
	public String toString() {
		String Sreal = String.valueOf(real); // real String
		String Simag = String.valueOf(imag);// imag String
		String text = "";
		if(real != 0 && imag > 0)
			text = Sreal + "+" + Simag + "i";
		else if(real == 0 && imag > 0)
			text =  Simag + "i";
		else if(real != 0 && imag == 0)
			text = Sreal ;
		else if(real == 0 && imag == 0)
			text = "0";
		else if(real == 0 && imag < 0)
			text = Simag;
		else 
			text = Sreal + "" + Simag + "i";
		
		return "(" + text + ")";
	}
	
	// check isReal , check isImag
	public boolean isReal() {
		boolean check = false;		
		if(imag == 0)
			check = true;

		return check;
	}
	
	public boolean isImaginary() {
		boolean check = false;		
		if(imag != 0 &&  real == 0)
			check = true;

		return check;
	}
	
	
	// check if real and imag is equal
	public boolean equals(double real , double imag) {
		return (this.real == real && this.imag == imag);
	}
	
	public boolean equals(MyComplex another) {
		return (real == another.real && imag == another.imag);
	}
	
	// magnitude = (real^2 + imag^2)^(1/2)
	public double magnitude() {
		double Preal = Math.pow(real,2); // power real^2
		double Pimag = Math.pow(imag,2); // power imag^2
		double plusPI = Preal + Pimag; //  real^2 + imag^2 
		double result = Math.sqrt(plusPI); // square roo (real^2 + imag^2 )

		return result;
	}
	
	//argument(in radinas) = tanarc(y/x) ; real + imagi = x+yi
	public double argument() {
		double yOverx = imag/real; // y over x =   y/x
		double result = Math.atan(yOverx);

		return result;
	}

	// (x+yi)+(x+yi) = (x + x ) + (y + y)i
	public  MyComplex add(MyComplex right) {
		
		this.real = this.real + right.real;
		this.imag = this.imag + right.imag;
		return this;
	}

	// (x+yi) - (x+yi) = (x - x) + (y-y)i
	public MyComplex subtract(MyComplex right) {
		
		this.real = this.real - right.real;
		this.imag = this.imag - right.imag;
		return this;
	}
	
	// (x+yi) * (x+yi) = xx + xyi + xyi + yyi^2 = (xx + yyi_2) + (xyi + xyi) ; note i^2 = -1
	public MyComplex multiply(MyComplex right) {
		
		double Xreal ;
		double Ximag;
		Xreal = ( (real* right.getReal() )+ (imag * right.getImag() *  -1) ) ;
		Ximag = ( (real * right.getImag()) + (imag * right.getReal()) );
		
		this.real = Xreal;
		this.imag = Ximag;
		
		return this;
	}
	
	
	// a+bi / c +di =  (ac+bd / c^2 + d^2) + (bc - ad / c^2 + d^2)i
	public MyComplex divide(MyComplex right) {
		double a = real ;
		double b = imag;
		double c = right.getReal();
		double d = right.getImag();
		
		this.real = ((a*c) + (b*d)) / (Math.pow(c, 2) + Math.pow(d, 2));
		this.imag = ((b*c) - (a*d)) / (Math.pow(c, 2) + Math.pow(d, 2));
		
		return this;
	}
	
}
