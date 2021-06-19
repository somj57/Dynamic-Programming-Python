//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb-stairs-official/ojquestion
//1. You are given a number n, representing the number of stairs in a staircase.
//2. You are on the 0th step and are required to climb to the top.
//3. In one move, you are allowed to climb 1, 2 or 3 stairs.
import java.util.*;

public class ClimbStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n = sc.nextInt();
        System.out.println("Recursion...");
        int pathRec = countRec(n);
        System.out.println(pathRec);
        
        System.out.println("DP Memo.......");
        int pathDP = countDP(n,new int[n+1]);
        System.out.println(pathDP);
        
        System.out.println("DP Tab.......");
        int pathDPTab = countTab(n);
        System.out.println(pathDPTab);
        
    }
    public static int countRec(int n){
        if (n == 0){
            return 1;
        }else if (n < 0){
           return 0;
        }
        System.out.println(n);
        int num1 = countRec(n-1);
        int num2 = countRec(n-2);
        int num3 = countRec(n-3);
        int cp = num1+num2+num3;
        return cp;
    }   
    public static int countDP(int n,int[] qb){
        if (n == 0){
            return 1;
        }else if (n < 0){
           return 0;
        }
        if (qb[n]>0){
            return qb[n];
        }
        System.out.println(n);
        int num1 = countRec(n-1);
        int num2 = countRec(n-2);
        int num3 = countRec(n-3);
        int cp = num1+num2+num3;
        qb[n] = cp;
        return cp;
    } 
    
    public static int countTab(int n){
        int[] dp = new int[n-1];
        dp[0] = 0;
        for (int i = 1;i<=n; i++){
            if (i==1){
                dp[i] = dp[i-1];
            }
            else if(i == 2){
                dp[i] = dp[i-1]+dp[i-2];
            }
            else{
                dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        return dp[n];
        
    }
}
