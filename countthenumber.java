//count the number//
import java.util.Scanner;
public class countthenumber {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		     System.out.println("enter the number");
		     int num=in.nextInt();
		     int a=num;
		     int count=0;
		   
		      while(a>0) {
		    	 a=a/10;
		    	 count++;
		     }
			     System.out.println("value"+num+"contains"+count+"digit");

	}

}
