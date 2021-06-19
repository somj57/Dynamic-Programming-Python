import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number : ");
    int n = sc.nextInt();

    System.out.println("Recurssion....");
    int fib = FibRec(n);
    System.out.println(fib);

    System.out.println("Dp-Memorization");
    int fib1 = FibMemo(n,new int[n+1]);
    System.out.println(fib1);

  }
  public static int FibRec(int n){
    if (n == 0 || n == 1){
      return n;
    }
    System.out.println(n);
    int num1 = FibRec(n-1);
    int num2 = FibRec(n-2);
    int fibn = num1 + num2;
    return fibn ;
  }

  public static int FibMemo(int n, int[] qb){
    if (n == 0 || n == 1){
      return n;
    }

    if (qb[n] != 0){
      return qb[n];
    }
    System.out.println(n);
    int num1 = FibMemo(n-1,qb);
    int num2 = FibMemo(n-2,qb);
    int fibn = num1 + num2;

    qb[n] = fibn;
    return fibn ;


  }
}