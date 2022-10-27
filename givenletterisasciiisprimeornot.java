//the given letter is ascii is prime or not
import java.util.*;
public class givenletterisasciiisprimeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string:");
        String a=in.nextLine();
        char arr[]=a.toCharArray();
        for(int i=0;i<arr.length;i++) {
              char ch=arr[i];
              int b=ch;
//        	  System.out.println(b);
              int res=0;
			    for(int j=2;j<=b/2;j++){
			    res=0;
			    if(b%j==0){
			        res=1;
			        break;
			    }
			    }
			   if(res==0){
			    System.out.println("prime ascii value: "+ch);
			   }
           }
        }
	}

