
public class Recursion1 {

    // public static void printNum(int n) {
    // if (n == 0) {
    // return;
    // }

    // System.out.println(n);
    // printNum(n - 1);
    // }

    // public static void main(String[] args) {
    // int n = 5;
    // printNum(n);
    // }
    // public static void printSum(int i, int n, int sum) {
    // if (n == i) {
    // sum += i;
    // System.out.println(sum);
    // return;
    // }
    // sum += i;
    // System.out.println(sum);
    // printSum(i + 1, n, sum);
    // }

    // public static void main(String[] args) {
    // int n = 5;
    // printSum(1, n, 0);
    // }
    // public static int calcfactorial(int n) {
    // if (n == 1 || n == 0) {
    // return 1;
    // }
    // int fact_nm = calcfactorial(n - 1);
    // int fact_n = fact_nm * n;
    // return fact_n;
    // }

    // public static void main(String[] args) {
    // int n = 5;
    // int ans = calcfactorial(n);
    // System.out.println(ans);
    // }

    public static void fib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fib(b, c, n - 1);

    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 7;
        fib(a, b, n - 1);
    }
}
