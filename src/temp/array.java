package temp;

import java.util.Scanner;

import static java.lang.System.in;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int[] array = countBy(x, y);
        System.out.println(array);
    }

    public static int[] countBy(int x, int y){
        int[] array = new int[y];

        for (int i = 1; i <= y; i++) {
            array[i-1] = x * i;

        }

        return array;
    }
}
