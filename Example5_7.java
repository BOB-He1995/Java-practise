class A{
	final double PI=3.1415926;
	public double getArea(final double r){
		return PI*r*r;
	}
	public final void speak(){
		System.out.println("How is everything here?");
	}
}

public class Example5_7{
	public static void main(String args[]){
		A a=new A();
		System.out.println("Area:"+a.getArea(100));
		a.speak();
	}
}