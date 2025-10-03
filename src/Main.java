//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// задание 1
        char clientOS = '1'; // 0 — iOS, 1 — Android

        if (clientOS == '0') {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == '1') {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // задание 2
        char clientOS1 = '0'; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2015;

        boolean isOldDevice = clientDeviceYear <= 2015;
        boolean isNewDevice = clientDeviceYear > 2015;
        boolean IOS = clientOS1 == '0';
        boolean Android = clientOS1 == '1';

        if (IOS && isOldDevice) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (IOS && isNewDevice) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (Android && isOldDevice) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (Android && isNewDevice) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // задание 3
        int year = 2021;
        int veak = 100;
        int veak4 = 400;
        int years4 = 4;
        if ((year % years4 == 0 && year % veak != 0 ) || (year % veak4 == 0)){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        // задание 4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        int deliveryDaysTwo = 2;
        int deliveryDaysThree = 3;
        if (deliveryDistance >= 100){
            System.out.println("Доставки нет");
        }
        else if (deliveryDistance <= 20 ) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + deliveryDaysTwo);
        }
        else {
            System.out.println("Потребуется дней: " + deliveryDaysThree);
        }
        // задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь, принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Ферваль, принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Март, принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Апрель, принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Май, принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Июнь, принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Июль, принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Август, принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Сентябрь, принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Октябрь, принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Ноябрь, принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Декабрь, принадлежит к сезону зима");
                break;
            default:
                System.out.println("Номер месяца больше 12");

        }
    }
}
