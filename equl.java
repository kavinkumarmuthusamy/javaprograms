package newp;

import java.util.Scanner;

public class equl {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter Comper Element:");
	int n=in.nextInt();
	System.out.println("Enter Size:");
	int s=in.nextInt();
	System.out.println("Enter the Elements");
	int arr[]=new int[s];
	for(int i=0;i<s;i++) {
		arr[i]=in.nextInt();
	}
	for(int i=0;i<s;i++) {
		if(n<=arr[i]) {
			arr[i]=arr[i]-n;
		}
		if(n>arr[i]) {
			arr[i]=arr[i]+n;
		}
	}
	int a=arr[s-1]-arr[0];
	System.out.println(a);
	}
}
