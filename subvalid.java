package newp;

import java.util.Scanner;
public class subvalid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size:");
//		String s=sc.nextLine();
		int ar[]= {4,-3,-1,6};
		int sum=0;
		for (int i : ar) {
			if(i==0) {
				System.out.println("yes");
				break;
			}else {
				sum+=i;
				if(sum==0) {
					System.out.println("yes");
					break;
				}
			}
		}

	}

}
