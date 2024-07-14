import java.util.Scanner;
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


        int total2 = 15000;
        double amountOfSaving = 12000000;
        double rate2 = 1.07;
        int month2 = 0;
        while (total2 < amountOfSaving) {
            total2 *= rate2; //сумму ежемесячного накопления с учетом процента.
            month2++; //считаем количество месяцев;
        }
        System.out.println(" Месяц " + month2 + " , сумма накоплений составляет " + total2 + " рублей. ");

        System.out.println(" Упражнение 5");


        int total3 = 15000;
        double amountOfSaving2 = 12000000;
        int month3 = 0;
        while (total3 < amountOfSaving2) {
            total3 *= rate2;

            month3++;

            if (month3 % 6 == 0) {

                System.out.println(" Месяц " + month3 + " , сумма накоплений составляет " + total3 + " рублей. ");


            }
        }


        System.out.println(" Упражнение 6");

        int total4 = 15000;
        int yearOrMoth = 108;
        int month4 = 0;
        while (month4 < yearOrMoth) {
            total4 *= rate2;
            month4++;
            if (month4 % 6 == 0) {
                System.out.println(" Месяц" + month4 + " , сумма накоплений составляет " + total4 + " рублей. ");
            }


        }

        System.out.println(" Упражнение 7");


        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первую пятницу месяца. ");

        int ferstFriday = sc.nextInt();

        for (; ferstFriday < 31; ferstFriday += 7) {

            System.out.println(" Сегодня пятница " + ferstFriday + " необходимо подготовить отчет");

        }

        System.out.println(" Упражнение 8");

        int year=1975;
        int lastYear=year -200;
        int nextYear= year +100;
        int year2=0;
        for (year2= lastYear; year2<=nextYear;year2++) {
            if ( year2%79==0) {
                System.out.println(" Комета прилетает " + year2 + " года.");

            }

        }
    }
}

