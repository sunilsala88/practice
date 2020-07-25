package java;

public class pattern2 {
  public static void main(String[] args){
    //Scanner scn =new Scanner(System.in);
    //int n=scn.nextInt();
    int n=5;
    int sp=1;
    int st=n/2+1;
    for(int i=1;i<=n;i++){
      for(int a=1;a<=st;a++)
      System.out.print("*\t");
      for(int j=1;j<=sp;j++)
      System.out.print('\t');

      
      for(int j=1;j<=sp;j++)
      System.out.print('\t');

      for(int a=1;a<=st;a++)
      System.out.print("*\t");

      System.out.println();
      if(i<=n/2){
        st--;
        sp+=1;
      }
      else{
        sp-=1;
        st+=1;
      }
    }

  }
  
}