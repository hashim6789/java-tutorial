import java.util.Scanner;

public class ThreeButtons {
    /*
     * take a button value (1,2,3)
     * condition apply (1->red, 2->green, 3->blue)
     */

    public static void main(String[] args) {
        int inp;
        System.out.println("  1          2          3");
        try( Scanner sc= new Scanner(System.in)){
            inp = sc.nextInt();
        }

        /*using if-else 
        if(inp == 1){
            System.out.println("red");
        }else if(inp == 2){
            System.out.println("green");
        }else if(inp == 3){
            System.out.println("blue");
        }else{
            System.out.println("Invalid Button!!!");
        }
        */

        /*using switch  */
        switch (inp) {
            case 1:
                System.out.println("red");               
                break;
            case 2:
                System.out.println("green");               
                break;
            case 3:
                System.out.println("blue");               
                break;
        
            default:
                System.out.println("Invalid Button!!!");
                break;
        }


    }
}
