class ComplexNumber{
	double real, imag;
	static int net = 0;
	ComplexNumber(double r, double i){
		real = r;
		imag = i;
		net++;
	}
	ComplexNumber(){
		real=imag=0;
		net++;
	}
	String display(){
		return ""+real+((imag>0)?"+":"")+imag+"i";
	}
	ComplexNumber sum(ComplexNumber a){
		return new ComplexNumber(real+a.real,imag+a.imag);
	}
	ComplexNumber sub(ComplexNumber a){
		return new ComplexNumber(real-a.real,imag-a.imag);
	}
	ComplexNumber mul(ComplexNumber a){
		return new ComplexNumber(real*a.real-imag*a.imag, real*a.imag + imag*a.real);
	}
	double mod(){
		return Math.sqrt(real*real+imag*imag);
	}
	ComplexNumber compl(){
		return new ComplexNumber(real, -1*imag);
	}
	public static void main(String args[]){
		ComplexNumber c1 = new ComplexNumber(5,7),
			c2 = new ComplexNumber(-6,-9);
		System.out.println("C1 = "+c1.display());
		System.out.println("C2 = "+c2.display());
		System.out.println("C1 + C2 = "+c1.sum(c2).display());
		System.out.println("C1 - C2 = "+c1.sub(c2).display());
		System.out.println("C1 * C2 = "+c1.mul(c2).display());
		System.out.println("C1 modulus = "+c1.mod());
		System.out.println("C1 complement = "+c1.compl().display());
		System.out.println("net : "+net);
	}
}