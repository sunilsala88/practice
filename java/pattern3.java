package java;

public class pattern3 {
  public static void main(String[] args){
    //Scanner scn =new Scanner(System.in);
    //int n=scn.nextInt();
    int n=5;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(j==n-i+1)System.out.print("*\t");
        else
        System.out.print("\t");
       
      }
      System.out.println();
    }

  }
  
}