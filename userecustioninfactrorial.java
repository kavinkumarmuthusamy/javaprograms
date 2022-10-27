//use recustion in factrorial
import java.util.Scanner;
public class userecustioninfactrorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
   	 	System.out.println("enter the value a ");
         int n=in.nextInt();
        int fact=mn(n);
        System.out.println(" factorial  :"+fact);
	}
  public static int mn(int n) {
	  if(n>0) {
		return n*mn(n-1);
	  }
	  else {
		 return 1;
	  }
  }
}
