public class Example6_1{
	public static void main(String args[]){
		China Zhang;
		Japan henlu;
		Zhang=new China();
		henlu=new Japan();
		Zhang.number=28+Computable.MAX;
		henlu.number=14+Computable.MAX;
		System.out.println("Zhang的学号"+Zhang.number+",Zhang求和结果"+Zhang.f(100));
		System.out.println("henlu的学号"+henlu.number+"，henlun求和结果"+henlu.f(100));
	}
}