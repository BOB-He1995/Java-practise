interface CompurerAverage{
	public double average(double []x);
}
class Gymnastics implements CompurerAverage{
	public double average(double []x){
		int count=x.length;
		double aver=0,temp=0;
		for (int i=0; i<count; i++) {
			for (int j=i; j<count; j++) {
				if (x[j]<x[i]) {
					temp=x[j];
					x[j]=x[i];
					x[i]=temp;
				}
			}
		}
		for (int i=1; i<count-1; i++) {
			aver=aver+x[i];
		}
		if (count<2) {
			aver=aver/(count-2);}
			else{
				aver=0;
			}
			return aver;
		}
}


class School implements CompurerAverage{
	public double average(double []x){
		int count=x.length;
		double aver=0;
		for (double param:x) {
			aver=aver+param;
		}
		aver=aver/count;
		return aver;
	}
}
public class E_6{
	public static void main(String args[]){
		CompurerAverage computer;
		computer=new Gymnastics();
		double a[]={9.29,9.76,9.99,9.62,9.87,9.83};
		double result=computer.average(a);
		System.out.printf("最后选手得分％5.3f\n",result);
		computer=new School();
		double b[]={87,99,56,89,98,77,66,69,57,87};
		result=computer.average(b);
		System.out.println("班级考试的平均分数："+result);
	}
}

















