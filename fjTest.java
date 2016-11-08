import java.util.*;
public class fjTest{
	public static void main(String[] args) {
		String words[]=new String[10];
		words[0]="A";
		String regex="[abcde]";
		System.out.println(words[0].matches(regex));
		String sentence[]={"1","2","3"};
		System.out.println(sentence[0]+"\n");
		System.out.println(sentence[2]);
		String w="我爱学english,比如英文字母abcdef";
		System.out.println(w);
		w=w.replaceAll(regex," ");
		System.out.println(w);
		String sent="Who are you(Caven)";
		regex="[\\s\\p{Punct}]+";
		String wor[]=sent.split(regex);
		System.out.println(wor[2]);
		for (int i=0; i<4; i++) {
		System.out.println(wor[i]);			
		}
		String ct="Who   are you now?我的爱人  你 在 哪里！bbbb";
		StringTokenizer disp=new StringTokenizer(ct," ?！");
		while(disp.hasMoreTokens()){
			String st=disp.nextToken();
			System.out.println(st);
		}
	}
}