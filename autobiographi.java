package newp;
import java.util.*;
public class autobiographi {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int a=in.nextInt();
		int c=0;
		int b=a;
		while(b!=0) {
			b=b/10;
			c++;
		}b=a;
		int c1=c;
		int res=0;
		int arr[]=new int[10];
        while(b!=0) {
        	arr[c-1]=b%10;
			b=b/10;
			c--;
        }
        for(int i=0;i<c1;i++) {
        	c=0;
        	for(int j=0;j<c1;j++) {
        		if(arr[j]==i)
        		c++;
        	}
        	if(arr[i]!=c) {
        		res=1;
        		break;
        	}
        }
        if(res==1) {
        	System.out.println("it is not Autobiographic number");
        }
        else {
        	System.out.println("Autobiographic number");
        }
	}

}
