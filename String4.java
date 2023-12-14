public class String4 {
    /*
     * compareTo() using
     *    if equal return 0
     *    else +ve or -ve values
     * == using
     * new String() using
     */

    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";

        if(s1.compareTo(s2) == 0){
            System.out.println("Strings are equal...");
        }else{
            System.out.println("Strings are equal...");
        }


        if(s1 == s2){
            System.out.println("Strings are equal...");
        }else{
            System.out.println("Strings are equal...");
        }


        if(new String("Tony") == new String("Tony")){
            System.out.println("Strings are equal...");
        }else{
            System.out.println("Strings are equal...");
        }

        


    }
}
