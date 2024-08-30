
import java.util.*;

public class FunctionMethod {

    public static void printMyName(String name) { // identifiers, naming convention camalCase
        System.out.println(name);
        return;
    }

    public static int calculateProduct(int a,int b){
        return a * b;
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void printFact(int n){
        int factorial = 1;
        for(int i = n; i >=1; i--){ 
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt(); // String name = sc.next();

        // printMyName(name);
        // int sum = calculateSum(a, b);
        // System.out.println("Sum is: " + calculateProduct(a, b));
            printFact(a);
    }
}
