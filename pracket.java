package newp;
import java.util.*;
public class pracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in=new Scanner(System.in);
      for(;;) {
      System.out.println("enter the problem");
      String a=in.nextLine();
      char arr[]=a.toCharArray();
      String b="()";
      char brr[]=b.toCharArray();
      int c=0;
      int d=0;
      int res=0;
      for(int i=0;i<arr.length;i++) {
    		  if(arr[i]==brr[0]) {
    			 c++; 
    		  }
    		  if(arr[i]==brr[1]) {
     			 d++; 
         	  }
    		  if(c<d) {
    			  res=1;
    			  break;
    		  }
    		  }
      if(res==0) {
      if(c==d) {
    	  System.out.println("it is correct");
    	  
      }else {
    	  System.out.println("it is wrong");
      }}
      else {
    	  System.out.println("it is wrong");
      }}
	}

}
