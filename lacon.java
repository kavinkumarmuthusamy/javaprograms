package diva;
import java.util.*;
public class lacon {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of arrya");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the arrya value");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int b=arr[i];
					arr[i]=arr[j];
					arr[j]=b;
				}
			}
		}
		int c=1,d=0,e=0;
		int y=arr[1]-arr[0];
		for(int i=0;i<n-1;i++) {
			int z=arr[i+1]-arr[i];
			if(z!=y) {
				y=z;
				c=1;
			}c++;
			if(c>d) {
				d=c;
				e=i+1;
			}
		}
		for(int i=(1+e)-d;i<=e;i++) {
			System.out.println(arr[i]);
		}
	}

}
