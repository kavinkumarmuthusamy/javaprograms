//swaping two string
import java.util.*;
public class swapingtwostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
System.out.println("enter the string1:");
String a=in.nextLine();
int x,y;
x=a.length();
System.out.println("enter the string2:");
String b=in.nextLine();
y=b.length();
a=a+b;
b="";
for(int i=0;i<x;i++) {
	b+=a.charAt(i);
}
a=a.substring(x,x+y);
System.out.println("changed string1"+a);
System.out.println("changed string2"+b);
	}

}
