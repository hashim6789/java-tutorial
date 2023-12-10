import java.util.Scanner;

public class function1 {
    /*
     * to print a given name in a function
     */

    public static void printMyName(String name){
        System.out.println("My name is "+name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);

    }
}
