import java.util.*;
public class Acadgild_Assignment4 {
     public static void main(String args[]){
    	 byte b;
    	 short s;
    	 int i;
    	 long l;
    	 float f;
    	 double d;
    	 System.out.println(" Enter the value of byte b, short s");
    	 Scanner sc=new Scanner(System.in);
    	 b=sc.nextByte();
    	 s=sc.nextShort();
    	 i=(int)(b+s);//Althoug not required bcz here implicit type casting is happening
    	 System.out.println(" Sum 1 :" +i);
    	 l=s+i;// Implicit type casting is happening
    	 System.out.println(" Sum 2 :"+ l);
    	 f=l+i; //Implicit type casting is happening
    	 System.out.println(" Sum 3 :"+ f);
    	 d=f+l; //Implicit type casting is happening
    	 System.out.println(" Sum 4 :" +d);
    	 i=(int)(d+l);// Explicit type casting is happening
    	 System.out.println(" Explicit Type Casting for Sum 5 :" +i);
     }
}
