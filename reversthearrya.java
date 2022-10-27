//revers the arrya
import java.util.Scanner;

public class reversthearrya {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int i=0;
			int n=in.nextInt();
			int[] arr =new int[n];
			for( i=0;i<n;i++) {
				arr[i]=in.nextInt();
			}
			for(i=n-1;0<=i;i--) {
			System.out.println(arr[i]);
			}
		}
	}

}
