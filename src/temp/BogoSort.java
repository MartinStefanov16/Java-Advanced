package temp;

public class BogoSort {
    public static void main(String[] args) {
       //int[] array = { 3, 2, 6, 5, 1, 0, 8, 4, 7};
       int[] array = { 3, 2, 6, 5, 1, 8, 4};


//       boolean finished = true;
//
//       while (finished) {
//           shuffle(array);
//
//           if (isSorted(array)) {
//               System.out.println("Sorted!");
//               printArray(array);
//               finished = false;
//           }
//
//       }

        for (int i = 0; i <= 10_000_000; i++) {
            shuffle(array);

            if (isSorted(array)) {
                System.out.println(i);
                System.out.println("Sorted!");
                printArray(array);
                return;
            }
        }
        System.out.println("Failed!");
        printArray(array);



    }

    private static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }

    private static void shuffle(int[] array) {

        // Math.random() returns a double positive
        // value, greater than or equal to 0.0 and
        // less than 1.0.
        for (int i = 0; i < array.length; i++)
            swap(array, i, (int)(Math.random() * i));
    }

    private static void swap (int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}