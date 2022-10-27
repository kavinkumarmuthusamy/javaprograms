package newpack;
import java.util.*;
public class dividetwoarrya {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of arrya");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the arrya");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();		
			}
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) { 
				if(arr[i]>arr[j]) {
					int b=arr[i];
					arr[i]=arr[j];
					arr[j]=b;
				}
			   }
			}
		int c=n;
		if(c%2!=0) {
			c=c+1;
		}
		int brr[]=new int[c];
		int b=0;
		for(int i=n/2;i<n;i++) {
			brr[b]=arr[i];
			b++;
		}
		b=b-1;
		for(int i=n/2;i<n;i++) {
				arr[i]=brr[b];
				b--;
			}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
