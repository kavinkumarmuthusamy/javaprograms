package diva;
import java.util.*;
public class phonedial {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int b=0;
		int c=9;
		while(c>5) {
        System.out.println("Enter the number in lessthan 5 digit");
        b=in.nextInt();
           int d=b;
           c=0;
           while(d!=0) {
        	   c++;
        	   d=d/10;
           }
		}
		int e=b;
		int d=0;
		String a0= " ";
		String a1= " ";
		String a2="abc";
		String a3="def";
		String a4="ghi";
		String a5="jkl";
		String a6="mno";
		String a7="pqrs";
		String a8="tuv";
		String a9="wxyz";
		int y=0;
		int n=1;
		int g=1;
		String brr[]=new String[500];
//		phonedial obj=new phonedial();
		String z=""; 
		 while(e!=0) {
			 d=e%10;
			 e=e/10;
			 switch(d) {
			 case 0:
				z=a0;
				n*=1;
				 break;
			 case 1:
				 z=a1;
				 n*=1;
				 break;
			 case 2:
				 z=a2;
				 n*=3;
				 break;
			 case 3:
				 z=a3;
				 n*=3;
				 break;
			 case 4:
				 z=a4;
				 n*=3;
				 break;
			 case 5:
				 z=a5;
				 n*=3;
				 break;
			 case 6:
				 z=a6;
				 n*=3;
				 break;
			 case 7:
				 z=a7;
				 n*=4;
				 break;
			 case 8:
				 z=a8;
				 n*=3;
				 break;
			 case 9:
				 n*=4;
				 z=a9;
				 break;
				
			 }
			 String[] err=z.split("");
		     String[] frr=new String [n];
		     int f=0;
				if(y>0){
				for(int i=0;i<err.length;i++) {
				for(int j=0;j<g;j++) {
					frr[f]=err[i]+brr[j];
						 f++;
				}
				}
				}
				else {
					frr=err;
				}g=n;
				 				brr=frr;
			 y++;
         }
		 for(int i=0;i<n;i++) {
			 System.out.print(brr[i]+"  ");
		 }
	}

}
