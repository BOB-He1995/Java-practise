interface ShowMessage{
	void showMark(String s);
}

class TV implements ShowMessage{
	public void showMark(String s){
		System.out.println("*******");
		System.out.println(s);
		System.out.println("*******");
	}
}

class PC implements ShowMessage{
	public void showMark(String s){
		System.out.println("@@@@@@");
		System.out.println(s);
		System.out.println("@@@@@@");
	}
}

public class Example6_2{
	public static void main(String args[]){
		ShowMessage sm;
		sm=new TV();
		sm.showMark("panasonic tv");
		sm=new PC();
		sm.showMark("apple");
	}
}