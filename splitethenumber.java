//splite the number
import java.util.Scanner;
public class splitethenumber {

	public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
          System.out.println("enter the string");
  		String a=in.nextLine();
  	      char[] arr = a.toCharArray();
  	      for(int i=0;i<arr.length;i++) {
  		int as=(int)arr[i];
  		if(48<=arr[i]&&arr[i]<=57) {
  			System.out.println(arr[i]);
//  			continue;
  		}
//  		else {
//			System.out.println(arr[i]);
//  		}
  	      }
	}

}
