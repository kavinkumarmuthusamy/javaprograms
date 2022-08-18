package newp;
import java.util.*;
public class frequencenumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("enter the number1");
        int a=in.nextInt();
        System.out.println("enter the number2");
        int b=in.nextInt();
        System.out.println("enter the number3");
        int c=in.nextInt();   
        System.out.println("enter the number4");
        int d=in.nextInt();
        int e=0;
        int ab=a;
        while(a!=0) {
        	a=a/10;
        	e++;
        }
        a=b;
        while(a!=0) {
        	a=a/10;
        	e++;
        }
        a=c;
        while(a!=0) {
        	a=a/10;
        	e++;
        }
        a=d;
        while(a!=0) {
        	a=a/10;
        	e++;
        }
     
        int arr[]=new int[e];
        e=0;
        while(ab!=0) {
        	arr[e]=ab%10;
        	ab=ab/10;
        	e++;
        }
        while(b!=0) {
        	arr[e]=b%10;
        	b=b/10;
        	e++;
        }
        while(c!=0) {
        	arr[e]=c%10;
        	c=c/10;
        	e++;
        }
        while(d!=0) {
        	arr[e]=d%10;
        	d=d/10;
        	e++;
        }
        c=0;
        d=0;
       
        for(int i=0;i<e;i++) {
        	 b=1;
          for(int j=0;j<e;j++) {
        	  if(arr[i]==arr[j]&&i!=j&arr[j]!=99) {
        		  arr[j]=99;
        		  b++;
        	  }
          }
          if(b>=c) {
        	  if((b==c&&arr[i]>arr[d])||b>c) {
        	  c=b;
        	  d=i;}
          }
        }
        System.out.println(arr[d]+" "+c);
	}
}
