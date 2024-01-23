import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       fib(n);
    }
    static void fib(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        System.out.print(dp[0]+" "+dp[1]+" ");
        for(int i=2;i<=n;i++){
           dp[i]=dp[i-1]+dp[i-2];
           System.out.print(dp[i]+" ");
        }
    }
}
