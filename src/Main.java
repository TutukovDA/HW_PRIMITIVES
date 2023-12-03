import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int price = 13676;// Стоимость билета
        int bonus = price / 20;// Механизм расчета бонусных миль
        System.out.println("С покупки билета Вам полагается " + bonus + " бонусных миль");
    }
}