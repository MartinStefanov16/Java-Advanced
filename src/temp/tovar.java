package temp;

import java.util.Scanner;

public class tovar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loads = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int price = 0;

        int countWithMicrobus = 0;
        int countWithTrain = 0;
        int countTruck = 0;

        for (int load = 1; load <= loads; load++){

            int tovar = Integer.parseInt(scanner.nextLine());

            count += tovar;

            if (tovar <= 3){
                countWithMicrobus += tovar;
            } else if (tovar <= 11) {
                countTruck += tovar;
            } else {
                countWithTrain += tovar;
            }

        }

        int priceMicrobus = countWithMicrobus * 200;
        int priceTruck = countTruck * 175;
        int priceTrain = countWithTrain * 120;

        double averagePrice = (double) (priceMicrobus + priceTrain + priceTruck) / count;

        double microbus = ( (double) countWithMicrobus /count) * 100.00;
        double Truck = ((double) countTruck/count) * 100.00;
        double Train = ((double) countWithTrain/count) * 100.00;

        System.out.printf("%.2f %n", averagePrice);
        System.out.printf("%.2f%%%n",microbus);
        System.out.printf("%.2f%%%n",Truck);
        System.out.printf("%.2f%%%n", Train);
    }
}