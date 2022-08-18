package newp;
import java.util.*;
public class oddevenorevenodd {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of arrya");
		int n=in.nextInt();
		int min=9999;
		int arr[]=new int[n];
		int brr[]=new int[n];
		int crr[]=new int[n];
		int b=0;
		int c=0;
		for(int i=0;i<n;i++) {
			System.out.println("enter the "+(i+1)+"index value");
			arr[i]=in.nextInt();
			if(arr[i]<min) {
				min=arr[i];
			}
			
			if(arr[i]%2==0) {
				brr[b]=arr[i];
            System.out.println(brr[b]);
            b++;
			}
			else {
				crr[c]=arr[i];
				System.out.println(crr[c]);
				c++;
			}
		}
		int a=0;
		if(min%2==0) {
			for(int i=0;i<b;i++) {
				arr[a]=brr[i];
				a++;
	            arr[a]=crr[i];
	            a++;
			}
		}
		else {
			for(int i=0;i<c;i++) {
				arr[a]=crr[i];
				a++;
	            arr[a]=brr[i];
	            a++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
