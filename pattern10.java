public class pattern10 {
    /*
     * print pattern like
     * 
     * 1
     * 01
     * 101
     * 0101
     * 10101
     */

    public static void main(String[] args) {
        int count = 0;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                count++;
                if(count%2 == 0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
