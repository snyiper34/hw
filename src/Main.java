//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// задание 1
        int age = 20;
        int age1 = 10;
        if (age >= 18) {
            System.out.println("Возраст человека равен " + age + " он совершеннолетний");
        }
        else {
                System.out.println("Возраст человека равен " + age1 + " он не достиг совершеннолетия, нужно немного подождать");
        }
// задание 2
        int temp = 10;
        int temp1 = -10;
        if (temp >= 5) {
            System.out.println("На улице " + temp + "  градусов, можно идти без шапки");
        }
        else  {
            System.out.println("На улице " + temp1 + " градусов, нужно надеть шапку");
        }
// задание 3
        int speed = 90;
        int speed1 = 50;
        if (speed >= 60) {
            System.out.println("Cкорость " + speed + " придется заплатить штраф");
        }
        else  {
            System.out.println("Cкорость " + speed1 + " можно ездить спокойно");
        }
// задание 4
        int ageAge = 3;
        int ageAge1 = 13;
        int ageAge2 = 22;
        int ageAge3 = 32;
        if (ageAge >= 2 && ageAge <= 6) {
            System.out.println("Возраст человека равен " + ageAge + " ему нужно ходить в детский сад");
        }
        else if (ageAge1 >= 7 && ageAge1 <= 17) {
            System.out.println("Возраст человека равен " + ageAge1 + " ему нужно ходить в школу");
        }
        else if (ageAge2 >= 18 && ageAge2 <= 24) {
            System.out.println("Возраст человека равен " + ageAge2 + " его место в университете");}
        else {
            System.out.println("Возраст человека равен " + ageAge3 + " ему пора ходить на работу");
        }
// задание 5
        int ageAttraction = 3;
        int ageAttraction1 = 13;
        int ageAttraction2 = 22;
        if (ageAttraction <= 5) {
            System.out.println("Возраст ребенка равен " + ageAttraction + " он не может кататься на аттракционе");
        }
        else if (ageAttraction1 >= 5 && ageAttraction1 <= 14) {
            System.out.println("Возраст ребенка равен " + ageAttraction1 + " он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя"); }
        else {
            System.out.println("Возраст ребенка равен " + ageAttraction2 + " он может кататься без сопровождения взрослого");
        }
// задание 6
        int vagon = 102;
        int sit = 60;
        int stand = (vagon - sit);

        if (sit + stand >= vagon) {
            System.out.println("Вагон уже полностью забит");
        }
        else if (sit < vagon) {
            System.out.println("Есть сидячие места");
        }
        else {
            System.out.println("Есть только стоячие места");
        }

// задание 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println(one + " Большее число");
        }
        else if (two >= three) {
            System.out.println(two + " Большее число");
        }
        else {
            System.out.println(three + " Большее число");
        }


    }
}
