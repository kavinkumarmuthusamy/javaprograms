package diva;
import java.util.*;
public class employee {
    public employee(int n,String arr[],int brr[],String crr[],String drr[]) {
    	for(int i=0;i<n;i++) {
    		System.out.println(arr[i]+"  "+brr[i]+"   "+crr[i]+"  "+drr[i]);
    	}
    }
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.println("enter the number of employee");
		int n=in.nextInt();
		in.nextLine();
		String arr[]=new String[n];
		int brr[]=new int[n];
		String crr[]=new String[n];
		String drr[]=new String[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the name");
			arr[i]=in.nextLine();		
			System.out.println("enter the year of joining");
			brr[i]=in.nextInt();
			in.nextLine();
			System.out.println("enter the salary");
			crr[i]=in.nextLine();
			System.out.println("enter the area");
			drr[i]=in.nextLine();}
		employee obj=new employee(n,arr,brr,crr,drr); 

	}

}
