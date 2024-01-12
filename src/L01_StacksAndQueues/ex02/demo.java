package L01_StacksAndQueues.ex02;

import java.util.Scanner;

import static java.lang.System.in;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int countToDelete = 4;

        StringBuilder text = new StringBuilder();
        text.append("1234");

        int textLength = text.length();

        for (int i = 1; i <= countToDelete; i++) {
            text.deleteCharAt(text.length() - 1);
        }

        System.out.println(text);

    }
}
