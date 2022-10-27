package newpack;
import java.util.*;
public class decryptedstring {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		String s=in.nextLine();
		System.out.println("enter the number");
		int n=in.nextInt();
		char srr[]=s.toCharArray();
		s="";
		int a=0;
		int b=0;
		String c="";
		String d="";
		for(int i=0;i<srr.length;i++) {
			if(srr[i]>=48&&srr[i]<=57) {
				a=srr[i]-48;
				for(int j=0;j<a;j++) {
				d+=c;	
				}
			c="";
			}else {
				c+=srr[i];
			}
		}
       char drr[]=d.toCharArray();
       System.out.println(drr[n-1]);
	}

}
