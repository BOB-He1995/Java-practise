class Circle{
	double radius;
	double getArea(){
		double area=3.14*radius*radius;
		return area;
	}
}


public class Example4_3{
	public static void main(String args[]){
		Circle circle;
		circle=new Circle();
		circle.radius=163.160;
		double area=circle.getArea();
		System.out.printf("半径是%5.3f的圆的面积：\n%5.3f\n",circle.radius,area);
		Rectangle rectOne;
		rectOne=new Rectangle();
		rectOne.width=25.9;
		rectOne.height=298.7;
		area=rectOne.getArea();
		System.out.printf("long is %5.3f width is %5.3f area is %5.3f\n",rectOne.width,rectOne.height,area);
	}
}