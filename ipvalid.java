package newp;

import java.util.Scanner;

public class ipvalid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ip:");
		String s=sc.nextLine();
		String [] val=s.split("[.]");
		try {
		if(val.length==4) {
			Boolean q=true;
			for (String st: val) {

				if(Integer.parseInt(st)<256 && Integer.parseInt(st)>0) {
					continue;
				}
				else {
					q=false;
					break;
				}

			}if(q) {
			System.out.println("valid");
			}else {
				System.out.println("Invalid");
			}
		}

		else {
			System.out.println("Invalid");
		}
		}
		catch (Exception e) {
			System.out.println("Invalid");
		}
	}
}
