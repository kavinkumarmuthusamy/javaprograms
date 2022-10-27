package newpack;
import java.util.*;
public class longestsubstring {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
        String s=in.nextLine();
        char srr[]=s.toCharArray();
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int z=0;
        for(int i=0;i<srr.length;i++) { 
        	c=1;
        	for(int j=i+1;j<srr.length;j++) {
        		a=j+1;
        		if(srr[i]==srr[j]) {
        			break;
        		}
        		c++;
        	}
        	 z=0;
        	if(c>b) {
        		
        		for(int k=i;k<a;k++) {
        			for(int l=k+1;l<a;l++) {
        				if(srr[k]==srr[l]) {
        					z=1;break;
        				}
        			}
        		}
        		if(z==0) {
        		b=c;
        		d=a;
        		e=i;}
        	}
        	
        }
        System.out.println("length "+b);
        for(int i=e;i<d;i++) {
        	System.out.print(srr[i]);
        }
	}

}
