public class ConstructionBank extends Bank{
	double year;
	public double computerInterest(){
		super.year=(int)year;
		double remainNumber=year-(int)year;
		int day=(int)(remainNumber*100);
		interest=super.computerInterest()+day*0.0001*savedMoney;
		System.out.printf("%d yuan save %dyear %dday \n",savedMoney,super.year,day);
		return interest;
	}
}