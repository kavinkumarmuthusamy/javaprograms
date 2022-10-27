package newpack;
import java.util.*;
public class arryapro {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of first arrya");
		int n=in.nextInt();
		System.out.println("enter the size of first arrya");
		int m=in.nextInt();
		int arr[]=new int[n];
		int brr[]=new int[m];
		int crr[]=new int[m+n];
		System.out.println("enter the arrya 1");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		for(int i=0;i<m;i++) {
			brr[i]=in.nextInt();
		}
		System.out.println("same element in two arrya");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i]==brr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		System.out.println("A-B in two arrya");
		for(int i=0;i<m;i++) {
			crr[i]=brr[i];
		}
		int c=m;
		for(int i=0;i<n;i++) {
			int res=0;
			for(int j=0;j<m;j++) {
				if(arr[i]==brr[j]) {
					res=1;
				}
			}
			if(res==0) {
				System.out.println(arr[i]);
				crr[c]=arr[i];
				c++;
			}
		}
		System.out.println("join in two arrya");
		for(int i=0;i<c;i++) {
			System.out.println(crr[i]);
		}
		System.out.println("ass order in two arrya");
		for(int i=0;i<c;i++) {
			for(int j=i;j<c;j++) { 
				if(crr[i]>crr[j]) {
					int b=crr[i];
					crr[i]=crr[j];
					crr[j]=b;
				}
			   }
			}
		for(int i=0;i<c;i++) {
			System.out.println(crr[i]);
		}
	}

}
