public class calFT{
	public static void main(String[] args) {
		double i;
		double y=1;
		double sum=0;
		for (i=1; i<=20; i++) {
			y=y*i;
			sum=sum+1/y;
		}
		System.out.println(sum);
	}
}