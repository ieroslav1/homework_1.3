public class Main {
    public static void main(String[] args) {

        // Задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        int productionYear = 2015;
        int clientDeviceYear = 2011;
        if (clientDeviceYear <= productionYear) {
            System.out.print("Установите облегчённую версию приложения ");
        } else if (clientDeviceYear > 2015) {
            System.out.print("Установите версию приложения ");
        }
        if (clientOS == 1) {
            System.out.println("для Android по ссылке");
        } else {
            System.out.println("для iOS по ссылке");
        }

        // Задание 3
        int year = 2004;
        if (year % 400 == 0 && year % 100 != 0 || year % 4 == 0) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }

        // Задание 4
        int deliveryDistance = 200;
        int days = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance <= 20) {
            days = 1;
        } else {
            days = days + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        System.out.println("Потребуется " + days +" дней");

        // Задание 5
        int monthNumber = 4;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("Месяца не существует");
        }
    }
}
