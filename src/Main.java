//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//1
        int salary= 15000 ;// сколько
        int total=0;//кошелек с накоплением
        int month = 0;//месяца
                while(  total<2459000) { //копим до 2459000
                    total=total+total/100;
                    total=total+salary;
                    month++;
                    System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей. ");

//2





                    
    }
}