//triangle programin star
import java.util.Scanner;

public class triangleprograminstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=in.nextInt();	
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
			System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
			System.out.print("**");
		}
			//for(int j=0;j<=i;j++) {
			//System.out.println("a");
		//}
			System.out.println();
		}
		int m=0;
		for(int i=n;i>0;i--) {			
	
			for( int k=0;k<m;k++) {
				System.out.print(" ");
		      }m++;
		      
		      
			for(int j=1;j<=i;j++) {
				System.out.print("**");
			}
			
			System.out.println();
			
			
	    }
}}

