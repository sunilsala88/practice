
import java.io.*; 
import java.util.Scanner;
import javax.xml.crypto.KeySelector.Purpose;

public class hello {
  public static void main(String[] args){
    Scanner scn =new Scanner(System.in);
    int n=scn.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print("\t");
      }
      for(int k=i;k>=1;k--){
        System.out.print("*\t");
      }
      System.out.println();
    }


  }
}
