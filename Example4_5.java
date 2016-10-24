public class Example4_5{
	public static void main(String args[]){
		Battery nanfu=new Battery(100);
		System.out.println("南孚电池的电量是："+nanfu.electricityAmount);
		Radio radio=new Radio();
		System.out.println("收音机开始使用电池");
		radio.openRadio(nanfu);
		System.out.println("目前南孚电池的电量是："+nanfu.electricityAmount);
	}
}