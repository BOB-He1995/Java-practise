public class testIf{
	public static void main(String[] args) {
		int x=10,y=5,z=100;
		if (x>y) {
			x=z;
		}else
			y=x;
		z=y;
		System.out.println(""+(x+y+z));
	}
}