//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Упражнение 1");
        int salary = 15000;// сколько
        int total = 0;//кошелек с накоплением
        int month = 0;//месяца
        while (total < 2459000) { //копим до 2459000
            total = total + total / 100;
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей. ");
        }
        System.out.println(" Упражнение 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }

        System.out.println(" Упражнение 3");

        int population = 12000000; // общая численность населения сейчас
        int birthRate = 17; // рождаемость на тысячу человек
        int deathRate = 8; // смертность на тысячу человек

        for (int year = 1; year < 11; year++) {
            population += (birthRate - deathRate) * population / 1000 * 10;
            System.out.println(" Год " + year + " ,численность населения составляет " + population);
        }
        System.out.println(" Упражнение 4");


        double money = 15000;
        int i1 = 0;
        double bankPercent = 0.07;
        int all = 12_000_000;
        while (money < all) {
            i1 = i1 +1;
            money = money + money * bankPercent;
            System.out.println("Сумма " + money + " , количество месяцев " + i1);
        }


            System.out.println(" Упражнение 5");
            double money1 = 15000;
            int period = 6;
            int years = 9;
            int allMonth = years * 12;
            double bankPercent2 = 0.07;
            for (int i2 = 0; i2 <= allMonth; i2++) {
                money1 = money1 + money1 * bankPercent2;
                if (i % period == 0) {
                    System.out.println("Сумма " + money1 + " , количество месяцев " + i2);
                }
                System.out.println(" Упражнение 6");
                for (int fr = 1; fr < 31; fr += 7) {
                    System.out.println("Сегодня пятница " + fr + " необходимо подготовить отчет");
                }
            }
            System.out.println(" Упражнение 7");
                int currentYear = 2023;
                for (int i3 = 0; i3 < currentYear + 100; i3 += 79) {
                    if (i3 > currentYear - 200) {
                        System.out.println(i3);
                    }
    }
}}