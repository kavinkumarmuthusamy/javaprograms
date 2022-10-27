package newp;
import java.util.*;
public class firstnonreptingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("enter the string");
String a=in.nextLine();
char arr[]=a.toCharArray();
int res=0;
for(int i=0;i<arr.length;i++) {
   res=0;
   for(int j=0;j<arr.length;j++) {
	  if(arr[i]==arr[j]&&i!=j) {
		  res=1;
	  }
   }
   if(res==0) {
	   System.out.println(arr[i]);
	   break;
   }
}
	}

}
