public class determinePN{
	public static void main(String[] args) {
		int i,n,p;
		System.out.println("素数是");
		System.out.println("2");
		for (i=3; i<=100; i++) {
			for (n=2; n<i; n++) {
				p=i%n;
				if (p!=0) {
					continue;
				}else
				break;
			}
			if (n<i) {
				continue;
			}else{
			System.out.println(i);
			}
		}
	}
}