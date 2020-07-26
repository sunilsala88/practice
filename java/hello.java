import java.util.*;

  
  public class hello{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int a = scn.nextInt();
      int b = scn.nextInt();
      int base=scn.nextInt();

      int dn = getValue(a, b,base);
      System.out.println(dn);
   }
   public static int  getValue(int a,int b,int base) {
     int carry=0;
     int ans=0;
     int i=1;
     while(a!=0 || b!=0){
      int a1=a%base;
      int b1=b%base;
      a=a/base;
      b=b/base;
      int temp=a1+b1+carry;
      if(temp>=base){
        ans=(temp-base-1)*i;
        carry+=1;
      }
      else{
        carry=0;
      }
      i=i*base;
     }
     
     return ans;

     
   }
  }