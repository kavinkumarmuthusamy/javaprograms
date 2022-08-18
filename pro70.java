import java.util.*;
public class pro70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner in=new Scanner(System.in);
   System.out.println("enter the number");
   int a=in.nextInt();
   int res=0;
   for(int i=2;i<=a/2;i++) {
	   if(a%i==0) {
res=1;	   }
	   
   }
   if(res==1) {
		  System.out.println("it is not prime "+a);
	   }
	   else {
		   System.out.println("it is a prime "+a);
	   }
	}

}
