
import java.io.*; 
import java.util.Scanner;

import javax.xml.crypto.KeySelector.Purpose;



public class hello {
  

  public static void main(String[] args){
    int a,b,sum;
    try{
      methodA();
      Scanner in =new Scanner (new File("test.in"));
      System.out.println("exit main");
    }
    catch(ArithmeticException ex){
      System.out.println("fine caught");
    }
    catch(FileNotFoundException ex){
      System.out.println("file except");
    }
    catch(Exception es){
      System.out.println("new");
    }
    finally{
      System.out.println("must run");
    }
    
  }
  public static void methodA(){
try{
  System.out.println(1/0);
}
finally{
  System.out.println("finally");
}
System.out.println("exit methon a");

  }
}