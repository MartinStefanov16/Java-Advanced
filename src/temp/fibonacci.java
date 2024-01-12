package temp;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        int tribo = 0;

        for (int i = 4; i <= n; i++) {
            tribo = a + b + c;
            a = b;
            b = c;
            c = tribo;
        }
        System.out.print(tribo);
    }
}