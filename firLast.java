
import java.util.*;
public class firLast {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter an string:");
		String a=s.nextLine();
		System.out.println("enter number of str:");
		int d=s.nextInt();
		String[] wt=new String [d+1];
		for(int i=0;i<=d;i++) {
			wt[i]=s.nextLine();
		}
for (String string : wt) {
	System.out.println(string);
}
//		char fir=a.charAt(0);
//		char sec=a.charAt(a.length()-1);
		for(int i=1;i<=d;i++) {
//			char fi=wt[i].charAt(0);
//			char se=wt[i].charAt(wt[i].length()-1);
//			if(fir==fi&&sec==se) {
			if(a.charAt(0)==wt[i].charAt(0)&&a.charAt(a.length()-1)==wt[i].charAt(wt[i].length()-1)) {
				System.out.println("the repeted string : "+wt[i]);
			}
		}
	}

}
