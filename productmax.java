package diva;
import java.util.*;
public class productmax {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the size of the arrya");
		int n=in.nextInt();
		int [] a=new int[n];
		int b=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the number"+(i+1));
			a[i]=in.nextInt();
			if(a[i]==0) {
				b=1;
			}
		}
		int c=1;
		if(b==0) {
			b=1;
        for(int i=0;i<n;i++) {
        	if(i!=n-1) {
        	   b*=a[i];	
        	}
        	if(i!=0) {
        		c*=a[i];
        	}
        }
        if(b>c) {
        	c=b;
        }
        }
		else if(b==1) {
			for(int i=0;i<n;i++) {
				if(a[i]==0) {
					if(b>c) {
						c=b;
					}
					b=1;
				}
				else {
					b*=a[i];
				}
			}if(b>c) {
				c=b;
			}
		}
		System.out.println(c);
	}

}
