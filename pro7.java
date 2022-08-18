//mearching two arrya
import java.util.Scanner;

public class pro7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		System.out.println("enter the size:");
				int n=in.nextInt();
				int res[]=new int[n+n];
				System.out.println("enter the value a:");
				int[] a =new int[n];
				for(int i=0;i<n;i++) {
					a[i]=in.nextInt();
				}
				System.out.println("enter the valueb:");
                 int[] b =new int[n];
			for(int j=0;j<n;j++) {
					b[j]=in.nextInt();
					}
			for(int i=0;i<n;i++) {
				res[i]=a[i];
			}
			
			for(int j=0;j<n;j++) {
				res[n+j]=b[j];
			}
			
			for(int i=0;i<n+n;i++) {
			System.out.println(res[i]);
			}
			} 
	}
	

