import java.io.*; 
import java.util.Scanner;
import javax.xml.crypto.KeySelector.Purpose;

public class pattern1 {
  
  public static void main(String[] args){
    //Scanner scn =new Scanner(System.in);
    //int n=scn.nextInt();
    int n=5;
    int sp=n/2;
    int st=1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=sp;j++){
        System.out.print('\t');
      }
      for(int k=1;k<=st;k++){
        System.out.print("*\t");
      }
      System.out.println();
      if(i<=n/2){
        sp--;
        st+=2;
      }
      else{
        sp++;
        st-=2;
      }
    }

  }
}