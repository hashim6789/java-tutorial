import java.util.Scanner;

public class function3 {
    /*
     * Make a function to multiply 2 numbers and return the product.
     */

    public static int findProduct(int n1, int n2){
        return n1*n1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = findProduct(a, b);
        System.out.println("Product = "+product);
    }
}
