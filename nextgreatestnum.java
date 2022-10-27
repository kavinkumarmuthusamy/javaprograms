package newp;
import java.util.*;
public class nextgreatestnum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the how many number give");
         int n=in.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++) {
        	System.out.println("enter the"+(1+i)+"number");
        	arr[i]=in.nextInt();
         }
         for(int i=0;i<n;i++) {
        	 int res=0;
        	 for(int j=i;j<n;j++) {
        		if(arr[i]<arr[j]) {
        			System.out.println(arr[i]+" --&gt "+arr[j]);
        			res=1;
        			break;
        		}	
        		}
        	 if(res==0) {
        		 System.out.println(arr[i]+" --&gt -1");
        	 }
         }
	}

}
