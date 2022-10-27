//sum of given value
import java.util.Scanner;
public class sumofgivenvalue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
   	 	System.out.println("enter the arrya a ");
         int a=in.nextInt();
     	System.out.println("enter the arrya b");
     	int b=in.nextInt();
     	System.out.println("enter the arrya c");
     	int c=in.nextInt();
     	System.out.println("enter the add size m");
		int m=in.nextInt();

       if(m==0) {
    	   a=a%10;
    	   b=b%10;
    	   c=c%10;
       }else if(m==1) {
    	   if(a<10) {
    		   a=1;
    	   }else {
    		   a=a/10;
    		   a=a%10;
    	   } if(b<10) {
    		   b=1;
    	   }else {
    		   b=b/10;
    		   b=b%10;
    	   } if(c<10) {
    		   c=1;
    	   }else {
    		   c=c/10;
    		   c=c%10;
    	   }
       }else {
    	   if(a<100) {
    		   a=2;
    	   }
    	   else {
    		   a=a/100;
    		   a=a%10;
    	   }if(b<100) {
    		   b=2;
    	   }
    	   else {
    		   b=b/100;
    		   b=b%10;
    	   }if(c<100) {
    		   c=2;
    	   }
    	   
    	   else {
    		   c=c/100;
    		   c=c%10;
    	   }
       }
              int ans=a+b+c;
         System.out.println("sum of given index:"+ans);
	

}
}