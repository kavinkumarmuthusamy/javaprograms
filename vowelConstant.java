
import java.util.*;
public class vowelConstant {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter an string:");
		String a=s.nextLine();
		String v="aeiouAEIOU";
		int h=0;
		for(int i=0;i<v.length();i++) {
			for (int j = 0; j < a.length(); j++) {
				if(v.charAt(i)==a.charAt(j)) {
				h++;	
				}
			}
		}
		System.out.println("the number of vowel: "+h);
		System.out.println("the number of constant: "+(a.length()-h));
	}

}
