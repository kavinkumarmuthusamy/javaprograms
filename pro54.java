//sum of the value
import java.util.*;
public class pro54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=in.nextInt();
        System.out.println("enter the string:");
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
       	 a[i]=in.nextInt();
        }
        System.out.println("enter the number:");
        int b=in.nextInt();
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(a[i]+a[j]==b) {
        			System.out.println("intex"+i+": "+a[i]+"  index"+j+": "+a[j]+"sum ans:"+b);
        		}	
        	}
        }
	}

}
