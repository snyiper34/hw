//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1, 2, 3");
        int [] celieNumbers = new int [3];
        celieNumbers [0] = 1;
        celieNumbers [1] = 2;
        celieNumbers [2] = 3;
        System.out.println(celieNumbers[0] + " , " + celieNumbers[1] + " , " + celieNumbers[2]);
        System.out.println(celieNumbers[2] + " , " + celieNumbers[1] + " , " + celieNumbers[0]);

        double [] drob = new double[]{1.57, 7.654, 9.986};
        System.out.println(drob[0] + " , " + drob[1] + " , " + drob[2]);
        System.out.println(drob[2] + " , " + drob[1] + " , " + drob[0]);

        char [] simvols = new char[]{'*' , '%' , '$' , '@'};
        System.out.println(simvols[0] + " , " + simvols[1] + " , " + simvols[2] + " , " + simvols[3]);
        System.out.println(simvols[3] + " , " + simvols[2] + " , " + simvols[1] + " , " + simvols[0]);

        System.out.println("Задание 4");
        for (int i = 0; i < celieNumbers.length; i++) {
            if (celieNumbers[i] % 2 != 0) {
                celieNumbers[i] += 1;
            }
        }
        System.out.println("Убраны нечетные числа: " + celieNumbers[0] + " , " + celieNumbers[1] + " , " + celieNumbers[2]);

    }
}
