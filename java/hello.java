import java.util.*;
  
  public class hello{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int c=scn.nextInt();
      int dn = getValueInBase(n, b,c);
      System.out.println(dn);
   }
 
   public static int getValueInBase(int n, int b,int c){
       int ans=0;
       int i=1;
       while(n!=0){
         int r=n%c;
         n=n/c;
         ans=ans+r*i;
         i=i*b;
       }
       return ans;
   }
  }