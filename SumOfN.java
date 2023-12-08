import java.util.Scanner;

class SumOfN{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int sum = 0;

            for(int i=1; i<=a; i++){
                sum += i;
            }
            System.out.println(sum);
        }
    }
}