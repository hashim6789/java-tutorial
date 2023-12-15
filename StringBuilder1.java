public class StringBuilder1 {
    /*
     * Declaration
     * charAt
     * setCharAt
     * insert
     * delete
     * append
     * length
     */

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hashim");
        System.out.println(sb);
        
        System.out.println(sb.charAt(0));
        
        sb.setCharAt(0, 'h');
        System.out.println(sb);
        
        sb.insert(4, 'i');
        System.out.println(sb);
        
        sb.delete(4, 5);
        System.out.println(sb);
        
        sb.append("Muhammed");
        System.out.println(sb);

        System.out.println("length = "+sb.length());

    }
}
