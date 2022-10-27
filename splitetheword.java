//splite the word
import java.util.Scanner;

public class splitetheword {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
   	 	System.out.println("enter the character ");
   	 String str=in.nextLine();
   	 	String arr[]=str.split(" ");
   	 	for(int i=0;i<arr.length;i++) {
   	 		System.out.println(arr[i]);
   	 	}
	}

}
