package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.in;

public class works {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean border = isInBorder(x1, x2, y1, y2, x, y);
        System.out.println((border) ? "Border" : "Inside / Outside");
    }

    private static boolean isInBorder(int x1, int x2, int y1, int y2, double x, double y) {
        if (x == x1 && y > y1 && y <= y2){
            return true;
        }else if (x == x2 && y > y1 && y < y2){
            return true;
        }else if (y == y1 && x > x1 && x < x2){
            return true;
        } else if (y == y2 && x > x1 && x < x2){
            return true;
        }
        return false;
    }
}
