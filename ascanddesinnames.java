//asc and des in names
import java.util.*;
public class ascanddesinnames {

	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enrer the number:");
        int n=in.nextInt();
       String a[]=new String[n];
       System.out.println("enter the string:");
       for(int i=0;i<n;i++) {
    	    a[i]=new String(in.next());
       }
      for(int i=0;i<n-1;i++) {
    	  for(int j=1;j<n;j++) {
    		  if(a[i].compareTo(a[j])>0) {
				String temp=a[i];
				a[i]=a[j+1];
				a[j+1]=temp;
    		  }
		}
			
      }
      System.out.println("asscendingorder name list");
      for(int i=0;i<n;i++) {
    	  System.out.println(a[i]);
      }
	}

}
