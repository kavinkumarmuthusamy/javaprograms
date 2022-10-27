package newpack;
import java.util.*;
public class printgivenline {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int n=in.nextInt();
		int a=1;
			for(int j=1;j<=n;j++) {
				System.out.print(a);
				a=a*(n-j)/j;
			}
	}

}
