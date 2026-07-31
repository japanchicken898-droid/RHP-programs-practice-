import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int[] arr=new int[N+1];
    for(int i=1;i<=N;i++){
        arr[i]=sc.nextInt();
    }
    int same=0,exchange=0;
    for(int i=1;i<=N;i++){
        if(i==arr[i]){
            same+=1;
        }
        else if(i==arr[arr[i]]){
            exchange+=1;
        }
    }
    int a=(same*(same-1))/2+exchange/2;
    System.out.println(a);
  }
}
