import java.util.Scanner;

public class BitManipulation4 {
    /*
     * update bit value in the position _ fron a number n
     * 
     * 0 for - NOT with AND
     * 1 for - OR
     */

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();

        int n = 5;
        int pos = 1;
        int BM = 1<<pos-1;

        if(op == 1){
            int set = n | BM;
            System.out.println(set);
        }else{
            int clear = ~(BM) & n;
            System.out.println(clear);






            
        }



    }
}
