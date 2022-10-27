//squer root
import java.util.Scanner;

public class squerroot {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 System.out.println("enter the value:");
		int a=in.nextInt();
		double b=a/2;
		double c=0;
		while(b!=c) {
			c=b;
			b=(a/b+b)/2;
			
		}
     System.out.println("given value is:"+a);
     System.out.println("squerroot value is:"+b);
	}

}
