public class Fraction {
 
	private int a, b;
 
	private static Fraction  ZERO =new Fraction(0,1);
	private static Fraction  UN =new Fraction(1,1);	
	
	public Fraction() {
		a = 0;
		b = 1;
	}
 
	public Fraction(int a) {
		this.a = a;
		this.b = 1;
	}
 
	public Fraction(int a, int b) {
		this.a = a;
		if (b != 0)
			this.b = b;
		else
			this.b = 1;
	}
 
	public void setA(int a) {
		this.a = a;
	}
 
	public void setB(int b) {
		this.b = b;
	}
 
	public int getA() {
		return this.a;
	}
 
	public int getB() {
		return this.b;
	}
 
	public void Mult(Fraction f) {
		this.a *= f.getA();
		this.b *= f.getB();
	}
 
	public void Add(Fraction f) {
		this.a = this.a * f.getB() + this.b * f.getA();
		this.b = this.a * f.getB();
	}
 
	public double getint() {
		return  1.0*(this.a/this.b);
		
		
	}
	
	public static void main(String[] args){
		Fraction fraction = new Fraction(5,6);
		fraction.Mult(new Fraction(3, 2));
		System.out.println(fraction.getA());
		System.out.println(fraction.getB());
	}
}