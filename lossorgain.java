package newp;
import java.util.*;
class stock{
	public static double gain(double b,double s){
		return(float) ((b/s)*100);
	}
	public static double loss(double b,double s){ 
		float c=(float) ((s/b)*100);
		c=100-c;
		return c;
	}
}
public class lossorgain {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the buying rate");
		double b=in.nextDouble();
		System.out.println("enter the salesing rate");
		double s=in.nextDouble();
		stock obj=new stock();
		if(s>b) {
		System.out.println("gain  "+obj.gain(b,s)+"%");}
		else {
			System.out.println("loss  "+obj.loss(b,s)+"%");}
		}
	}


