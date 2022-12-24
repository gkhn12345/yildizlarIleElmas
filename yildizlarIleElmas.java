import java.util.Scanner;

public class yildizlarIleElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {

            for (int c = 1; c <= (n - i); c++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= (2 * i) - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
