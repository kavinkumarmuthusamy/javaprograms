//sum of the even number and odd of even
import java.util.Scanner;

public class por12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}int a=0,b=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				System.out.println("it is evev number"+arr[i]);
				a=arr[i]+a;
			}
			else {
				System.out.println("it is odd number"+arr[i]);
				b=arr[i]+b;

			}

		}			System.out.println("it is sum evev number"+a);
			System.out.println("it is sum odd number"+b);

	}
}
