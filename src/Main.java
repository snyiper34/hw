//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int firstFriday = 7;
        for (int i = firstFriday; i <= 31; i = i + 7) {
            firstFriday = i;
            System.out.println("Сегодня пятница, " + firstFriday + "е число. Необходимо подготовить отчет");

        }
        System.out.println("Задание 2");
        int distanceMarafon = 0;
        int endMarafon = 42_195;
        int notificationInternal = 500;
        do {
            int remainingDistance = endMarafon - distanceMarafon;
            System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
            distanceMarafon += notificationInternal;
        }
        while (distanceMarafon <= endMarafon);
        System.out.println("Финиш! Поздавляем с завершением марафона");

        System.out.println("Марофон начался! Всего дистанция: " + endMarafon + " м");
        for (int remainingDistance = endMarafon; remainingDistance >= 0; remainingDistance -= notificationInternal) {
            System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
        }
        System.out.println("Финиш! Поздавляем с завершением марафона");
        System.out.println("Задание 3");
        int ostatokSummaUser = 1000;
        int today = 0;
        int remainingOstatok = ostatokSummaUser;
        int dailyCost = 100;
        while (remainingOstatok >= dailyCost) {
            today++;
            if (today % 5 == 0) {
                System.out.println("День " + today + " бесплатный (осталось " + remainingOstatok + " руб)");
                continue;
            }
            remainingOstatok -= dailyCost;
            System.out.println("День " + today + " списание " + dailyCost + " руб (осталось " + remainingOstatok + " руб)");
        }
        System.out.println("Результат: Бюджета " + ostatokSummaUser + " руб хватит на " + today + " дней");
        System.out.println("Остаток бюджета: " + remainingOstatok + " руб");

        for (int day = 1; remainingOstatok >= dailyCost; day++) {
            today = day;

            if (day % 5 == 0) {
                System.out.println("День " + day + ":  бесплатный (осталось " + remainingOstatok + " руб)");
                continue;
            }
            remainingOstatok -= dailyCost;
            System.out.println("День " + day + " Спиание " + dailyCost + " руб (осталось " + remainingOstatok + " руб)");
        }

        System.out.println("Результат: Бюджета " + ostatokSummaUser + " руб хватит на " + today + " дней");
        System.out.println("Остаток бюджета: " + remainingOstatok + " руб");
        System.out.println("Задание 4");
        int mouth = 0;
        double total = 0;
        int nacoplenie = 12_000_000;
        int vlozenie = 15_000;
        double procent = 0.07;
        while (true) {
            mouth++;
            total += vlozenie;
            if (mouth % 6 == 0) {
                total += total * procent;
            }
            if (total >= nacoplenie) {
                break;

            }
            System.out.printf("Месяц: %d, Накоплено: %.2f%n", mouth, total);
        }
        System.out.printf("Цель достигнута за %d месяцев%n", mouth);
        System.out.printf("Итоговая сумма: %.2f%n", total);
        System.out.println("Задание 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        int chargeMinute = 2;
        while (charge < 100 && overheats < 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев");
                if (overheats == 3) {
                    System.out.println("Досрочное завершение из-за перегревов");
                    break;
                }
                continue;
            }
            charge += chargeMinute;
            if (charge >= 100) {
                System.out.println("Зарядка завершена");
                break;
            }
        }
        System.out.println("Время зарядки составило " + minute + " минут");
        System.out.println("Текущий заряд: " + charge + "%");
    }
}
