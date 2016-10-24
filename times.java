import java.util.Scanner;
public class times{
	public static void main(String[] args) {
		int a,b,mid,max,min,i;
		System.out.println("输入两个数字，回车结束");
		Scanner reader=new Scanner(System.in);
		a=reader.nextInt();
		b=reader.nextInt();
		if (a>b) {
			mid=b;
			max=a;
			min=b;	
		}else{
			mid=a;
			max=b;
			min=a;
		}
		for (i=mid; i>0; i--) {
			if (min%i==0&&max%i==0) {
					System.out.println("最大公约数："+i);
				break;}
		}
		mid=(a*b)/i;
		System.out.println("最小公倍数："+mid);
	}
}