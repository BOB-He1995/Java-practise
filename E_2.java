class People{
	String name;
	void showName(){
		System.out.println("***\n");
	}
}
class American extends People{
	void showName(){
		System.out.println("美国人姓名是名在前姓在后:"+name);
	}
	void speakEnglish(){
		System.out.println("how are you");
	}
}
class Chinese extends People{
	void showName(){
		System.out.println("中国人姓名是姓在前名在后:"+name);
	}
	void speakChinese(){
		System.out.println("你好");
	}
}
public class E_2{
	public static void main (String args[]){
		People people=null;
		American american=new American();
		people=american;
		people.name="Mad.Lee";
		people.showName();
		american.speakEnglish();
		Chinese chinese=new Chinese();
		people=chinese;
		people.name="张三林";
		people.showName();
		chinese.speakChinese();
	}
}