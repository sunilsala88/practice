package java;

public class pattern6 {
  
  public static void main(String[] args){
    //Scanner scn =new Scanner(System.in);
    //int n=scn.nextInt();
    int n=6;    
   for(int i=0;i<n;i++){
     int a=1;
  for(int j=0;j<=i;j++){
System.out.print(a);
int p=a*(i-j)/(j+1);
a=p;
  }

System.out.println();
   }
  }

}