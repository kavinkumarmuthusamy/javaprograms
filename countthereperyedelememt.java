//count the reperyed elememt
import java.util.Scanner;

public class countthereperyedelememt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size:");
			int n=in.nextInt();
			System.out.println("enter the number:");
			int[] arr =new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=in.nextInt();
			}for(int i=0;i<n;i++) {
				int c=0;
				for(int j=0;j<n;j++) {
					if(arr[i]==arr[j]) {
						c++;
					}
				}if(c>1) {
				System.out.println("the element "+ arr[i]+ "is appear "+c+" times");
				}
			
			}
           
		}}

	


