//replace the value
import java.util.*;
public class replacethevalue {

	public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("enter the string:");
            String a=in.nextLine();
            String ar[]=a.split(" ");
            System.out.println("enter the changing word:");
            String b=in.nextLine();
            System.out.println("new word:");
            String c=in.nextLine();
            for(int i=0;i<ar.length;i++) {
            	if(ar[i].equals(b)) {
            		System.out.print(" "+c);
            	}
            	else {
            		System.out.print(" "+ar[i]);
            	}
            }
	}
}
