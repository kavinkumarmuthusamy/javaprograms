//right angle
import java.util.Scanner;

public class pro22 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=in.nextInt();	
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print("a");
		}
			System.out.println();
			}

		for(int i=n;i>0;i--) {
			for(int j=1;j<=i;j++) {
			System.out.print("a");
		}
			System.out.println();
			}
	}

}
