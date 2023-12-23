public class BitManipulation2 {
    /*
     * set bit value in the position _ fron a number n
     * OR
     */

     public static void main(String[] args) {
        int n = 5;
        int pos = 2;

        int BM = 1<<pos-1;
        int set = n | BM;

        System.out.println(set);



    }
}
