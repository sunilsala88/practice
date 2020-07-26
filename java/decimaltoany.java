package java;

public class decimaltoany {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int dn = getValueInBase(n, b);
    System.out.println(dn);
 }

 public static int getValueInBase(int n, int b){
     int ans=0;
     int i=1;
     while(n!=0){
         int r=n%b;
         n=n/b;
         ans+=r*i;
         i=i*10;
     }
     return ans;
 }

}