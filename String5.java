public class String5 {
    /*
     * substring() using
     */

    public static void main(String[] args) {
        String sentense = "My name is Muhammed Hashim";
        String fullName = sentense.substring(11);
        String firstName = sentense.substring(11,19);
        String lastName = sentense.substring(20);
        

        System.out.println(fullName);
        System.out.println(firstName);
        System.out.println(lastName);
    }
}
