//sum of number display triangle
import java.util.Scanner;
public class sumofnumberdisplaytriangle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=in.nextInt();
		int a;
		for(int i=1;i<n;i++) {
		
			 a=1;
			for(int j=n;j>=i;j--) {
			System.out.print(" ");
			}
			for(int j=a;j<=i;j++) {
			System.out.print(a+" ");
			a=a*(i-j)/j;
		}
			System.out.println();
			}
	}
	}

