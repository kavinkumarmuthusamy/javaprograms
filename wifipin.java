package newp;
import java.util.*;
public class wifipin {

	public static void main(String[] args) {
               Scanner in=new Scanner(System.in);
               System.out.println("enter the last name");
               String b=in.nextLine();
               for(;;) {	   
               System.out.println("enter the number in 3 digit");
               int n=in.nextInt();
               int z=0;
               int m=n;
               while(m!=0) {
                    z++;
            	   m=m/10;
               }
               if(z==3) {
               String c="";
                m=n;
               int o=0;
               while(m>19) {
               while(m!=0) {
            	   o+=m%10;
            	   m=m/10;
               }m=o;}
               if(m>1) {
               if(m%2==0) {
            	   c+=m;
               }
               else {
            	   c+=m-1;
               }}
               else {
            	   c+=2;
               }
               o=n%10;
               switch(o) {
               case 1:
            	   c+="!";
            	   break;
               case 2:
            	   c+="@";
            	   break;
               case 3:
            	   c+="#";
            	   break;
               case 4:
            	   c+="$";
            	   break;
               case 5:
            	   c+="%";
            	   break;
               case 6:
            	   c+="^";
            	   break;
            	   
               case 7:
            	   c+="&";
            	   break;
               case 8:
            	   c+="*";
            	   break;
               case 9:
            	   c+="(";
            	   break;
               case 0:
            	   c+=")";
            	   break;
               }
               char arr[]=b.toCharArray();
               char a=arr[arr.length-1];
               c+=a;
               n=n%100;
               n=n/10;
               c+=n;
               System.out.println(c);
               break;}
               else {
            	   System.out.println("please enter correctly.....");
               }
        }
	}

}
