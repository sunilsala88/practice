import java.util.*;

public class anybasetoanybase {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int from=sc.nextInt();
    int to=sc.nextInt();
    
    int a=convert_to_base_10(n, from);
    int ans=convert_from_10_to_any(a,to);
    System.out.println(ans);
  }

  public static int  convert_from_10_to_any(int n,int to) {
    int ans=0;
    int i=1;
    while(n!=0){
      int r=n%to;
      n=n/to;
      ans+=r*i;
      i=i*10;
    }
    return ans;
  }
  public static int convert_to_base_10(int n,int from){
    int ans=0;
    int i=1;
    while(n!=0){
      int r=n%10;
      n=n/10;
      ans+=r*i;
      i=i*from;
    }
return ans;
  }
}

    