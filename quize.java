public class quize{
	public static void main(String[] args) {
		String s="\\hello";
		System.out.println(s);
		s="\bhello";
		System.out.println(s);
		System.out.println("\n\t\t".length());
		System.out.println("你好KU".length());
		System.out.println("Bird".compareTo("Bird fly"));
		System.out.println("Hello".equals("hello"));
		Integer.parseInt("12");
		s="苹果";
		s=s+"好吃";
		System.out.println(s);
		byte d[]="abc我们喜欢篮球".getBytes();
		System.out.println(d.length);
		s=new String(d,0,7);
		System.out.println(s);
	}
}