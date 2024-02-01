package temp;

public class console {
    public static void main(String[] args) {


        int[] array = new int[2];
        try {
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException err){
            throw new ArrayIndexOutOfBoundsException();
        }




    }



    private static void scrollConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
