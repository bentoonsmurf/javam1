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
	
	public boolean equals(Fraction f1,Fraction f2) {
		long l1,l2;
		
		l1=f1.getA()*f2.getB();
		l2=f2.getA()*f1.getB();
		if(l1==l2)return true;
		else return false;		
		
		
	}
	
	public String convert(Fraction f) {
		String somme;
		somme = Integer.toString(f.getA()) +"/" +Integer.toString(f.getB());
		
		return somme;
	}
	
	public static void main(String[] args){
		Fraction fraction = new Fraction(5,6);
		fraction.Mult(new Fraction(3, 2));
		System.out.println(fraction.getA());
		System.out.println(fraction.getB());
		System.out.println(fraction.convert(fraction));
	}
}