import java.util.Scanner;

public class function4 {
    /*
     * Make a function to find factorial of a given number.
     */

    public static int findFactorial(int n){
        if(n <= 1){
            return n;
        }
        return n*findFactorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("factorial of "+a+" = "+findFactorial(a));
    }
}