package newpack;
import java.util.*;
public class powernotusestar {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int n=in.nextInt();
		System.out.println("enter the power");
		int a=in.nextInt();
		int b=n;
		for(int i=1;i<a;i++) {
			int c=b;
			for(int j=1;j<n;j++) {
				b+=c;
			}
		}
   System.out.println(b);
	}

}
