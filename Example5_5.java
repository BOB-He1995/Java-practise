public class Example5_5{
	public static void main(String args[]){
		int amount=8000;
		ConstructionBank bank=new ConstructionBank();
		bank.savedMoney=amount;
		bank.year=5.216;
		double interest=bank.computerInterest();
		System.out.printf("interest is %5.3f yuan\n",interest);
		
	}
}