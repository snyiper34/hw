import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[]inputArray1 = {3250, 4514, 2889, 5165, 3936};
        double[] outputArray1 = new double[4];
        int summa = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int pay : inputArray1) {
            summa += pay;
            if (pay > max){
                max = pay;}
            if (pay < min){
                min = pay;}
        }
        double averrage = (double) summa / inputArray1.length;
        outputArray1[0] = summa;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = averrage;
        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outArray1: " + Arrays.toString(outputArray1));
        System.out.println();

        System.out.println("Задание 2");

        int[] inputArray2 = {3478, 6754, 4578, 9875, 1587};
        double[] outputArray2 = new double[inputArray2.length];
        int sum = 0;
        for (int payment : inputArray2) {
            outputArray2[sum] = payment * 0.13;
            sum++;
        }
        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.print("outputArray2: [");
        for (int i = 0; i < outputArray2.length; i++) {
            System.out.printf("%.2f", outputArray2[i]);
            if (i < outputArray2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println();

        System.out.println("Задание 3");

        int[] inputArray3 = {5789, 4567, 6789, 3567, 2678};
        boolean[] outArray3 = new boolean[inputArray3.length];
        int index = 0;
        for (int bonus : inputArray3) {
            outArray3[index] = bonus > 5000;
            index++;
        }
        System.out.println("inputArray3: " + Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + Arrays.toString(outArray3));
        System.out.println();

        System.out.println("Задание 4");

        int[] inputArray4 = {6987, 6543, 2687, -8753, 6532};
        boolean[] outArray4 = {true};
        for (int balance : inputArray4 ) {
            if (balance < 0){
                outArray4[0] = false;
                break;
            }
        }
        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("outArray4: " + Arrays.toString(outArray4));
        System.out.println();

        System.out.println("Задание 5 ");

        int [] inputArray5 = {9873, -3956, 9785, -1352, 6543};
        int[] outArray5 = new int[1];
        int mouth = 1;
        for (int profit : inputArray5){
            if (profit < 0) {
                outArray5[0] += mouth;
            }
        }
        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outArray5: " + Arrays.toString(outArray5));
    }
}
