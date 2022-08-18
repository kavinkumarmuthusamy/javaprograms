//otp
import java.util.Scanner;
public class pro40 {
 public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 	 	  for(;;) {
   	 	 System.out.println("enter the first name");
   	 	  String a=in.nextLine();
   	 	  char arrya[]=a.toCharArray();
   	 	  if(arrya.length>=2) {
   	     System.out.println("enter the acount type:");
	 	  String b=in.nextLine();
	 	if(b.equals("savings")||b.equals("loan")||b.equals("current")) {
	 		int e=0,h=0;
	 	System.out.println("enter the 11 number");
	 	long n=in.nextLong();
		int[] c =new int[100];
		int[] z =new int[100];
	 	int i=0;
		while(n>0) {
			z[i]=(int) (n%10);
			n=n/10;
			i++;
		}if(i==11) {
	for(int j=0,i1=10;j<11;j++,i1--) {
	 		c[j]=z[i1];
	 	}
String ar[]=b.split("");
   	 	for(i=0;i<2;i++) {
   	 	System.out.print(ar[i]);
   	 	}
   	 	for( i=0;i<1;i++) {
   	 		System.out.print(c[i]);
   	 	}
   	 	for( i=0;i<5;i++) {
   	 		e=e+c[i];
   	 	}
   	 	int ans=single(e);
   	 	if(ans>9) {
   	 		ans=single(ans);
   	 	}
   	 		System.out.print(ans);
   	 	String arr[]=a.split("");
   	 	for(i=0;i<1;i++) {
   	 	System.out.print(arr[i]);
   	 	}
   	 	h=0;
   	 for(i=5;i<10;i++) {
	 		h=h+c[i];
	 	}
	 	int an=singl(h);
	 	if(an>9) {
	 		ans=singl(an);
	 	}
	 		System.out.print(an);
	   	 	System.out.print(arr[arr.length-1]);
   		 System.out.print(c[10]);
		} else {
   			 System.out.println("enter correct 11 numbere");
   		 }
	 	}else {
		System.out.println("enter the correct account type");
	 	}}}}
	 	
 
	public static int single(int e) {
		int f=1,g=0;
		
	while(e>0) {
		f=e%10;
		g+=f;
		e=e/10;
	}
	return g;
	}
	public static int singl(int h) {
		int k=1,l=0;
		
	while(h>0) {
		k=h%10;
		l+=k;
		h=h/10;
	}
	return l;
	}
}
