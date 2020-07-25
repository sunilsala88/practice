import java.io.*;

public class pattern4 {
  public static void main(String[] args){
    //Scanner scn =new Scanner(System.in);
    //int n=scn.nextInt();
    int n=7;
    int spo=n/2;
    int st=1;
    int spin=-1;

    for(int i=1;i<=n;i++){
      for(int j=1;j<=spo;j++)
      System.out.print('\t');
      System.out.print("*\t");
      for(int k=1;k<=spin;k++)
      System.out.print('\t');
      if(spin!=-1)
      System.out.print("*\t");
      
      if(i<=n/2){
        spo-=1;
        spin+=2;
      }
      else{
        spo+=1;
        spin-=2;
      }
      System.out.println();
    }

  }
  
}