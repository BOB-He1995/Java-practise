public class Bank{
	int savedMoney;
	int year;
	double interest;
	public double computerInterest(){
		interest=year*0.035*savedMoney;
		return interest;
	}
}