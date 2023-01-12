package diva;
import java.util.*;
public class evenfrist {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the length of arrya");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the arrya value");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		int c=n;
		for(int i=0;i<c;i++) {
			if(arr[i]%2!=0) {
				for(int j=c-1;j>i;j--) {
					if(arr[j]%2==0) {
						int b=arr[j];
						arr[j]=arr[i];
						arr[i]=b;
						break;
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
