package diva;
import java.util.*;
public class target {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of arrya");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the arrya value");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the target program");
		int z=in.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==z) {
					System.out.println(arr[i]+" , "+arr[j]);
				}
			}
		}

	}

}
