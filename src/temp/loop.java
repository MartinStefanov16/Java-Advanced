package temp;

public class loop {
    public static void main(String[] args) throws InterruptedException {

        for (int runs = 0; runs < 2; runs++) {
            for (int i = 1; i < 100; i++) {

                for (int j = 0; j < i; j++) {
                    System.out.print("X");
                }
                System.out.println();
                Thread.sleep(10);
            }

            for (int i = 100; i > 1; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("X");
                }
                System.out.println();
                Thread.sleep(10);

            }

        }




    }
}
