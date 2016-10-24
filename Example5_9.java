class EspecialCar{
	void cautionSound(){
	}
}
class PoliceCar extends EspecialCar{
	void cautionSound(){
		System.out.println("警车的警笛声："+"zhua..zhua..zhua..");
	}
}
class AmbulanceCar extends EspecialCar{
	void cautionSound(){
		System.out.println("救护车的救护声："+"jiu..jiu..jiu..");
	}
}
class FireCar extends EspecialCar{
	void cautionSound(){
		System.out.println("消防车的救火声："+"huo..huo..hou..");
	}
}
public class Example5_9{
	public static void main(String args[]){
		EspecialCar car=new PoliceCar();
		car.cautionSound();
		car=new AmbulanceCar();
		car.cautionSound();
		car=new FireCar();
		car.cautionSound();
	}
}