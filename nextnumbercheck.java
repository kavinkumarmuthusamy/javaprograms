package newp;
import java.util.*;
public class nextnumbercheck {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number ");
        int a=in.nextInt();
        int b=a;
        int c=0;
        while(b!=0) {
        	b=b/10;
        	c++;
        }
         b=a;
        int c1=c;
        int arr[]=new int[c];
        while(b!=0) {
        	arr[c-1]=b%10;
        	b=b/10;
        	c--;
        }
        int res=0;
        for(int i=0;i<c1-1;i++) {
        	if((arr[i]+1)==arr[i+1]) {
        		res=1;
        		break;
        	}
        }
        if(res==1) {
        	System.out.println("true");
        }else {
        	System.out.println("flase");
        }
	}

}
