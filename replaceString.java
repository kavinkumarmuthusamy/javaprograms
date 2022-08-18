
import java.util.*;
public class replaceString {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter an string:");
		String a=s.nextLine(),ans="";
		System.out.println("enter an char to search :");
		char f=s.next().charAt(0);
		char l='*';
		for(int i=0;i<a.length();i++) {
		if(f==a.charAt(i)) {
//			a.charAt(i)=l;
			ans+='*';
		}
		else {
			ans+=a.charAt(i);
		}
		}
		System.out.println(ans);
	}

}
