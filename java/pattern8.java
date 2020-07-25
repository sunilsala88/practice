package java;

public class pattern8 {
  public static void main(String[] args){
    int n=7;
    for(int a=1;a<=n;a++){
      if(a<=n/2+1 || a==n){
        System.out.print("*\t");
      }
      else{
        System.out.print("\t");
      }
    }
    System.out.println();
  
    for(int i=1;i<n/2;i++){
      for(int t=1;t<=n ;t++)
      {if ((t==n || t==n/2+1))
        System.out.print("*\t");
        else
         {System.out.print("\t");}}
      System.out.println();
    }
  
  
  
  
    for(int j=1;j<=n;j++){
      System.out.print("*\t");
    }
    System.out.println();
  
  
    for(int i=1;i<n/2;i++){
      for(int t=1;t<=n ;t++)
      {if (t==1 || t==n/2+1)
      System.out.print("*\t");
      else {System.out.print("\t");}}
      System.out.println();
    }
  
    for(int a=1;a<=n;a++){
      if(a>n/2 || a==1){
        System.out.print("*\t");
      }
      else{
        System.out.print("\t");
      }
    }
  
  
  
    
    
    
    
    }}
  
