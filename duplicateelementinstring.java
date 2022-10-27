//duplicate element in string
import java.util.Scanner;
public class duplicateelementinstring {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String a=in.nextLine();
	      char[] arr = a.toCharArray();
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=1+i;j<arr.length;j++) {
				if(arr[i]==(arr[j])) {
				count++;
				
			}}if(count>1) {
				System.out.println("reptated element  "+arr[i]);
			System.out.println(arr[i]+" times "+count);
			}
			else {
				System.out.println("uniques element: "+arr[i]);
			}
				}
		System.out.println("revers a string");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]); 
		}
		
		}}
