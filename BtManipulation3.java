public class BtManipulation3 {
    /*
     * clear bit value in the position _ fron a number n
     *  NOT with AND
     */

     public static void main(String[] args) {
        int n = 5;
        int pos = 3;

        int BM = 1<<pos-1;
        int clear = ~(BM) & n;

        System.out.println(clear);



    }
}
