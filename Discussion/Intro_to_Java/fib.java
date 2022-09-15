/** This is Discussion 1
 * Implement fib which takes in an integer n and returns the nth Fibonacci number.
 * The Fibonacci sequence is 0,1,1,2,3,5,8,13,21,....
 * A Fibonacci number is F(n) = F(n-1) + F(n-2)
 * Author: WFAN
 * Date: Sep 15, 2022
*/


public class fib {
    public static int FibMethod (int n) {
        if (n <= 1) {
            return n;
        }
        return FibMethod(n-1) + FibMethod(n-2);
    }

    public static void main(String[] args) {
        System.out.println(FibMethod(8));

    }
}
