class Name{	
}
public class tStest{
	public static void main(String[] args) {
		String a=new String("我爱你");
		System.out.println(a.toString());
		Name b=new Name();
		System.out.println(b.toString());
		char c[]={'我','很','爱','你'};
		String m=new String(c,0,2);
		System.out.println(m);
		String s="今天是 2 0 1 6 年的一个好日子";
		s.getChars(0,2,c,2);
		System.out.println(c);
		c=s.toCharArray();
		System.out.println(c);
		byte h[]="我爱学java".getBytes();
		s=new String(h);
		System.out.println(s);
		System.out.println(h);
		s="我是个java大神";
		h="我是个java大神大神".getBytes();
		System.out.println(h);
	}
}