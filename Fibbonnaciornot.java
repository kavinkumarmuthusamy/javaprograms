package newpack;
import java.util.*;
public class Fibbonnaciornot {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int n=in.nextInt();
		int a=1;
		int b=1;
		int c=0;
		while(a<n) {
		    c=a;
			a=a+b;
			b=c;
		}
		if(a==n) {
			System.out.println("Yes");
		}
		if(a!=n) {
			System.out.println("No");
		}
	}

}
