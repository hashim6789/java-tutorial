import java.util.Scanner;

public class SumOftwo {
    /* Take two input and find their sum */

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }
    }
    
}
