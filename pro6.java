//factorial//
import java.util.Scanner;

public class pro6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the value:");
			int n=in.nextInt();
			
			for(int a=n-1;a>1;a--) {
				n=n*a;
			}
			System.out.println("ans:"+n);
			
	}
	}

