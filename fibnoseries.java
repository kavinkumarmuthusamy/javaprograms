//fibnoseries//
import java.util.Scanner;

public class fibnoseries {
	public static void main(String[] args) {
		int a=0,b=1,c=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the value:");
			int n=in.nextInt();
			System.out.print(a+" " );
			System.out.print(b+" ");
		while(c<=n) {
			c=a+b;
			a=b;
			b=c;
		
       System.out.println(c+" " );
		}
		}
	}
