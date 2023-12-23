
public class BitManipulation1 {
    /*
     * get bit value in the position _ fron a number n
     * AND
     */

    public static void main(String[] args) {
        int n = 5;
        int pos = 1;

        int BM = 1<<pos-1;
        int get = n & BM;

        System.out.println(get);



    }
    
}