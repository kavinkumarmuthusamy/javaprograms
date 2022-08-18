//unique element
import java.util.Scanner;

public class pro8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size:");
			int i=0;
			int n=in.nextInt();
			System.out.println("enter the number:");
			int[] arr =new int[n];
			for( i=0;i<n;i++) {
				arr[i]=in.nextInt();
			}
			
            int j=i;   
				for(i=0;i<n;i++) {
					for( j=0;j<n;j++) {
						if(arr[i]==arr[j] && i!=j) {
break;						}
						if(j==n-1) {
							System.out.println("ans"+arr[i]);

						}
				}
			}
		}	
}
