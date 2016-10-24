public class findWS{
	public static void main(String[] args) {
		int i,n;
		for (i=1; i<=1000; i++) {
			int sum=0;
			for (n=1; n<i; n++) {
				if (i%n==0) {
					sum=sum+n;
				}
			}
			if (sum==i){
				System.out.println(i);
			}
		}
	}
}