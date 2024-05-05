public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        {
            System.out.println("Задача 1");
        }
        int i = 0;
        int sum = 15000;
        while (sum <= 2_459_000) {
            sum += 15000;
            i++;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + sum);
    }

    public static void task2() {
        {
            System.out.println("Задача 2");
        }
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");

        }
        System.out.println(" ");
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    {
        System.out.println(" ");
    }

    public static void task3() {
        {
            System.out.println("Задача 3");
        }
        int people = 12_000_000;
        int birth = 17;
        int death = 8;
        for (int year = 1; year <= 10; year++) {
            people = people + (birth - death) * people / 1000;
            System.out.println("Год " + year + " , численность населения составит " + people);
        }
    }

    public static void task4() {
        {
            System.out.println("Задача 4");
        }
        int money = 15000;
        int month = 1;
        while (money < 12_000_000) {
            money = money + (int) (money * 0.07);
            System.out.println("Месяц " + month + " сумма накоплений равна " + money);
            month++;
        }
    }

    public static void task5() {
        {
            System.out.println("Задача 5");
        }
        int money = 15000;
        int month = 1;
        while (money < 12_000_000) {
            money = money + (int) (money * 0.07);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + money);
            }
            month++;
        }
    }

    public static void task6() {
        {
            System.out.println("Задача 6");
        }
        int month = 1;
        int money = 15000;
        while (month <= 108) {
            money = money + (int) (money * 0.07);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + money);
            }
            month++;
        }
    }

    public static void task7() {
        {
            System.out.println("Задача 7");
        }

        for (int day = 3; day < 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + " -е число. Необходимо сделат отчет!");
        }
    }
    public static void task8() {
        {
            System.out.println("Задача 8");
        }
        for (int year = 0; year < 2024 + 100; year += 79) {
            if (year >= 2024 - 200) {
                System.out.println(year);
            }
        }
    }
}





































