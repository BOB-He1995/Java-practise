public class testString{
	public static void main(String args[]) {
		String s;
		s=new String("我很帅");
		String tom=new String(s);
		String tom2=s;
		System.out.println(s);
		s+="haha";
		System.out.println(tom);
		System.out.println(tom2);
		String s1;
		s1="    nice to meet you";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.equals("i love you"));
		System.out.println(s1.startsWith("ni"));
		System.out.println(s1.endsWith("you"));	
		System.out.println(s1.compareTo("我"));
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.substring(2,10));
		System.out.println(s1.trim());
		String num=new String("1234567");
		System.out.println(Double.parseDouble(num));
	}
}