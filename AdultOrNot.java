import java.util.Scanner;

public class AdultOrNot {
    /* 
     * Take age from user
     * apply condition like adult(age > 18),Otherwise not
     */

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();

            if(age > 18){
                System.out.println("Adult");
            }else{
                System.out.println("Not Adult");
            }
        }
        

    }
}
