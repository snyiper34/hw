import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1, 2, 3");
        int [] celieNumbers = new int [3];
        celieNumbers [0] = 1;
        celieNumbers [1] = 2;
        celieNumbers [2] = 3;
        String arrayNumbers = Arrays.toString(celieNumbers);
        System.out.println(arrayNumbers);
        for (int i = 0; i < celieNumbers.length / 2; i++) {
            int znacenie = celieNumbers[i];
            celieNumbers[i] = celieNumbers[celieNumbers.length - 1 - i];
            celieNumbers[celieNumbers.length - 1 - i] = znacenie;
        }
        System.out.println(Arrays.toString(celieNumbers));

        double [] drob = new double[]{1.57, 7.654, 9.986};
        String arrayDrob = Arrays.toString(drob);
        System.out.println(arrayDrob);
        for (int i = 0; i < drob.length / 2; i++) {
            double znacenie = drob[i];
            drob[i] = drob[drob.length - 1 - i];
            drob[drob.length - 1 - i] = znacenie;
        }
        System.out.println(Arrays.toString(drob));

        char [] simvols = new char[]{'*' , '%' , '$' , '@'};
        String arraySimvols = Arrays.toString(simvols);
        System.out.println(arraySimvols);
        for (int i = 0; i < simvols.length / 2; i++) {
            char znacenie = simvols[i];
            simvols[i] = simvols[simvols.length - 1 - i];
            simvols[simvols.length - 1 - i] = znacenie;
        }
        System.out.println(Arrays.toString(simvols));

        System.out.println("Задание 4");
        for (int i = 0; i < celieNumbers.length; i++) {
            if (celieNumbers[i] % 2 != 0) {
                celieNumbers[i] += 1;
            }
        }
        System.out.println("Убраны нечетные числа: " + celieNumbers[0] + " , " + celieNumbers[1] + " , " + celieNumbers[2]);

    }
}
