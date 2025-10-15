//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
   for (int i = 1; i <= 10; i++){
       System.out.println("Число " + i);
   }
        System.out.println("Заднаие 2");
   for (int i = 10; i >= 1; i--){
       System.out.println("Число " + i);
   }
        System.out.println("Задание 3");
   for (int i = 0; i <= 17; i = i + 2){
       System.out.println("Число " + i);
   }
        System.out.println("Задание 4");
   for (int i = 10; i >= (-10); i--){
       System.out.println("Число " + i);
   }
        System.out.println("Задание 5");
   for (int i = 1904; i <= 2096; i = i + 4){
       System.out.println(i + " год является високосным");
   }
        System.out.println("Задание 6");
   for (int i = 7; i <= 98; i = i + 7){
       System.out.println("Число " + i);
   }
        System.out.println("Задание 7");
   for (int i = 1; i <= 512; i = i * 2){
       System.out.println("Число " + i);
   }
        System.out.println("Задание 8");
   int mothSave = 29000;
   int totalSave = 0;
   for (int moth = 1; moth <= 12; moth++){
       totalSave += mothSave;
       System.out.println("Месяц " + moth + ", сумма накоплений равна " + totalSave + " рублей");
   }
        System.out.println("Задание 9");
   int mothSave1 = 29000;
   double totalSave1 = 0;
   double mothRate = 0.12 / 12;
   for (int moth = 1; moth <= 12; moth++) {
       totalSave1 += mothSave1;
       double mothproc = totalSave1 * mothRate;
       totalSave1 += mothproc;
       System.out.println("Месяц " + moth + ", сумма накоплений равна " + totalSave1 + " рублей");
   }
        System.out.println("Задание 10");
   for (int i = 1; i <= 10; i++){
       int result = 2 * i;
       System.out.println("2*" + i + "=" + result);
   }
    }
}
