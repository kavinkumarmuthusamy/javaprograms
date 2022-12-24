package diva;
import java.util.*;
public class weigth {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the how many person count");
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
			}
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			b[i]=in.nextInt();
			}
		System.out.println("Enter the value");
		int k=in.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j) {
					int d=(a[i]+a[j])/(b[i]+b[j]);
					if(d==k) {
						System.out.println((a[i]+a[j]));
						break;
					}
				}
			}
		}
		
	}

}
