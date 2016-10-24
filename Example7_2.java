public class Example7_2{
	public static void main(String args[]){
		ShowBoard board=new ShowBoard();
		board.showMess(new InputEnglish());
		board.showMess(new InputAlphabet()
		{	public void input()
			{	for(char c='a';c<='w';c++)
					System.out.printf("%3c",c);
			}
		}
		);
	}
}