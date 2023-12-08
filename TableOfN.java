import java.util.Scanner;

public class TableOfN {
    /*
     * read a number
     * multiply the number into 1-10
     * display like n x 1 = n
     */
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
        
            for(int i=1; i<=10; i++){
                System.out.println(n+" x "+i+" = "+(n*i));
            }
        }
    }
}
