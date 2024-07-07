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

        for (int year = 0; year < 10; year++) {
            population += (birthRate - deathRate) * population / 1000 * 10;


            System.out.println(" Год " + year + " ,численность населения составляет "+ population );
        }
    }
}
