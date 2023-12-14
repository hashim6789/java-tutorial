import java.util.Scanner;

public class Array2D {
    /*
     * Take a matrix as input from the user.
     *  Search for a given number x and
     * print the indices at which it occurs.
     * 
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int arr[][] = new int[a][b];

        for(int i=0;i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter the key for searching...");
        int key = sc.nextInt();

        for(int i=0;i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){

                if(arr[i][j] == key){
                    System.out.println(key+" value is situated in "+(i+1)+"th row's "+(j+1)+"th element");
                    break;
                }

            }
            System.out.println();
        }
   }
}
