//captile abcd
import java.util.*;
public class captileabcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String a=in.nextLine();
		char arr[]=a.toCharArray();
		String Ans="";
		for(int i=0;i<arr.length;i++) {
		char x='A';char y='Z';
			for(int j=0;j<26;j++) {
				if(arr[i]==x){
					Ans+=y;
//					arr[i]=Ans;
				}
				x++;y--;
			}
		}
		System.out.println(Ans);
	}

}
