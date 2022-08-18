package newp;
import java.util.*;
class first{
	public static String cal(double f,int n) {
		String c=String.format("%.1f", f);
	System.out.println(c);
	return c;
	}
	public static String ca(double f,int n) {
		String c=String.format("%.2f", f);
	System.out.println(c);
	return c;
	}
	public static String c(double f,int n) {
		String c=String.format("%.3f", f);
	System.out.println(c);
	return c;
	}
	public static String al(double f,int n) {
		String c=String.format("%.4f", f);
	System.out.println(c);
	return c;
	}
}
public class roundoff {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter float values");
		double f=in.nextFloat();
         System.out.println("enter the round value");
        int n=in.nextInt();
         first obj=new first();
         if(n==1) {
        	 first.cal(f,n);}
         if(n==2){
        	 first.ca(f,n);
         }
         if(n==3) {
        	 first.c(f,n);
         }
         if(n==4) {
        	 first.al(f,n);
         }
	}

}
