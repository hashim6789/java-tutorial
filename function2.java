import java.util.Scanner;

public class function2 {
    /*
     * Make a function to add 2 numbers and return the sum
     */

     public static int findSum(int n1,int n2){
        return n1+n2;
     }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 

        int sum = findSum(a, b);
        System.out.println("Sum is = "+sum);
    }
}
