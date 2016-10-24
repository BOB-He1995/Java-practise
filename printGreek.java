public class printGreek{
	public static void main(String[] args) {
		int firstLeter,lastLeter,i;
		char x='α';
		char y='ω';
		firstLeter=(int)x;
		lastLeter=(int)y;
		for (i=firstLeter; i<=lastLeter; ++i) {
			System.out.println((char)i);
		}
	}
}