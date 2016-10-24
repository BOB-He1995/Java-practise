import java.util.Scanner;
public class Example2_3 {
	public static void main(String args[ ]){
		System.out.println("请输入数字，按回车确认");
		System.out.println("最后输入数字0结束操作");
		Scanner reader = new Scanner(System.in);
		double sum =0;
		double h= reader.nextDouble();
		while(h!=0) {
			sum=sum+h;
			h= reader.nextDouble();
		}
		System.out.println("sum="+sum);
	}
}