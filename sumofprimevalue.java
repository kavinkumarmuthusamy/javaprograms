package newp;
import java.util.*;
public class sumofprimevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in=new Scanner(System.in);
      System.out.println("enter the size of array");
      int s=in.nextInt();
      int arr[]=new int[s];
      for(int i=0;i<s;i++) {
      System.out.println("enter the number"+(i+1)+"array value");
      arr[i]=in.nextInt();  
      }
      int res=0;
      int c=0;
      for(int i=0;i<s;i++) {
    	  res=0;
    	  if(arr[i]==0||arr[i]==1) {
    		  res=1;
    	  }else {
    	  for(int j=2;j<=arr[i]/2;j++) {
    		  if(arr[i]%j==0) {
    			  res=1;
    			  break;
    		  }
    	  }}
    	 if(res==0) {
     		c+=arr[i];
    		}
    	 else {
    		 continue;
    	 }
      }
      System.out.println(c);
	}

}
