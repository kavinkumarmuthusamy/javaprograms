//like otp 
import java.util.*;
public class likeotp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner in=new Scanner(System.in);
  		for(;;) {
          System.out.println("enter the string:");
          String a=in.nextLine();
          char ar[]=a.toCharArray();
          if(ar.length>=5&&ar.length<=15) {
        	  for(int i=0;i<ar.length-1;i++) {
        		  int as=0;
        		   as=(int)ar[i];
        		  if(as==32||(as>=48&&as<=57)) {
                  System.out.println("it can not exit");
                  break;
        		  }
        		
        	  }
          }else {
        	  System.out.println("it can not exit");
          }}
	}

}
