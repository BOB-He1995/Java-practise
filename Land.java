class Village{
	static int waterAmount;
	int peopleNumber;
}

public class Land{
	public static void main(String args[]){
		Village.waterAmount=200;
		System.out.println("水井中有"+Village.waterAmount+"升水");
		Village zhaoZhuang=new Village() ,liZhuang=new Village();
		int m=50;
		System.out.println("Village Zhao remove water"+m+"litter");
		zhaoZhuang.waterAmount=zhaoZhuang.waterAmount-m;
		m=100;
		System.out.println("Village liZhuang remove water"+m+"litter");
		liZhuang.waterAmount=liZhuang.waterAmount-m;
		zhaoZhuang.peopleNumber=80;
		liZhuang.peopleNumber=120;
		System.out.println("Village Zhao's population is:"+zhaoZhuang.peopleNumber);
		System.out.println("Village Li's population is:"+liZhuang.peopleNumber);
		m=10;
		System.out.println("Village Zhao's population reduce:"+m);
		zhaoZhuang.peopleNumber=zhaoZhuang.peopleNumber-m;
		System.out.println("Village Li's population reduce"+m);
		liZhuang.peopleNumber=liZhuang.peopleNumber-m;
		System.out.println("Village Li's population is:"+liZhuang.peopleNumber);
		System.out.println("Village Zhao's population is:"+zhaoZhuang.peopleNumber);
	}
}