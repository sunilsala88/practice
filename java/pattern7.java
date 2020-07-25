package java;

public class pattern7 {
  public static void main(String[] args){
    int n=5;
int sp=n/2;
int st=1;
int val=1;
    for(int i=1;i<=n;i++){
      for(int a=1;a<=sp;a++){
        System.out.print('\t');
      }
      int cval=val;
      for(int b=1;b<=st;b++){
        System.out.print(cval+"\t");
        if(b<=st/2) cval++;
        else cval--;
        
      }
      if(i<=n/2){
        sp--;
        st+=2;
        val++;
      }
      else{
        sp++;
        st-=2;
        val--;
      }
      System.out.println();
    }
  }
  
}