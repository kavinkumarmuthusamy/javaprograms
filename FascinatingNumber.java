package newp;
import java.util.*;
public class FascinatingNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
	    int a=in.nextInt();	
	    int b=0;
	    b=a*2;
	    int c=a;
	    int d=b;
	    while(d!=0) {
	    	a*=10;
	    	d=d/10;
	    }
	    a=a+b;
	    b=0;
	    b=c*3;
	    d=b;
	    while(d!=0) {
	    	a*=10;
	    	d=d/10;
	    }
	    a=a+b;
	    d=a;
	    b=0;
	    while(d!=0) {
	    	b++;
	    	d=d/10;
	    }
	    c=b;
	    d=a;
	    int arr[]=new int[b];
	    while(d!=0) {
	    	arr[b-1]=d%10;
	    	b--;
	    	d=d/10;
	    }
	    b=0;
	    for(int i=0;i<c;i++) {
	    	for(int j=0;j<c;j++) {
	    		if(arr[i]==arr[j]&&i!=j) {
	    			b=1;
	    			break;
	    		}
	    		if(arr[i]==0) {
	    			b=1;
	    			break;
	    		}
	    	}
	    }
	    if(b==1) {
	    	System.out.println("not Fascinating Number");
	    }else {
	    	System.out.println("Fascinating Number");
	    }
	}

}
