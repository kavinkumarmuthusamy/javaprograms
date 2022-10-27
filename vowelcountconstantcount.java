//constsnt and vowles 
package newp;
import java.util.*;
public class vowelcountconstantcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in=new Scanner(System.in);
      System.out.println("enter the string");
      String a=in.nextLine();
       String b="aeiouAEIOU";
       char arr[]=a.toCharArray();
       char brr[]=b.toCharArray();
       int res=0;
       String c="";
       String d="";

       for(int i=0;i<arr.length;i++) {
    	   res=0;
    	   for(int j=0;j<brr.length;j++) {
    		   if(arr[i]==brr[j]) {
    			   res=1;
    		   }
    	   }
    	   if(res==0) {
    		   c+=arr[i];
    	   }else {
    		   d+=arr[i];
    	   }
       }
       int e=c.length();
       int f=d.length();
       System.out.println("constant  "+c+"  number  "+e);
       System.out.println("vowel  "+d+"  number  "+f);
	}

}
