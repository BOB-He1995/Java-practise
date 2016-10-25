public class calMax{
	public static void main(String[] args) {
		int n=1;
		int sum=0;
		int i;
		for (i=1; sum<=9999; i++) {
			n=n*i;
			sum=sum+n;
		}
		i=i-2;
		System.out.println(i);
	}
}