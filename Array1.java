import java.util.Scanner;

public class Array1 {
    /*
     * Take an array as input from the user. Search for a given number x and print the index at which it occurs.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter search element");
        int key = sc.nextInt();
        int flag = -1;

        for (int i=0; i<n; i++){
            if(key == arr[i]){
                flag = i;
                break;
            }
        }

        if(flag != -1){
            System.out.println("the element is in "+(flag+1)+"th place...");
        }else{
            System.out.println("the element is not in this array...");
        }

    }
}
