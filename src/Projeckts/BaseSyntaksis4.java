package Projeckts;

import java.util.Scanner;

public class BaseSyntaksis4 {
    public static void main(String[] args) {
        System.out.println("Введите сумму вашего кредита: ");
        Scanner sc = new Scanner(System.in);

        float credit = sc.nextFloat();

        float creditAfter;
        creditAfter = + credit + (credit / 100) * 20;

        float credit2 = creditAfter;

        for (int i = 1; i < 13; i++){
            System.out.println("Внесите платёж за " + i + "й месяц");
            int platej = sc.nextInt();

            creditAfter = creditAfter - platej;

            if (creditAfter < 0){
                System.out.println("изначальный кредит: " + credit);
                System.out.println("кредит после начисления процентов: " + credit2);
                System.out.println("Вы закрыли кредит !!!");
                break;
            }
            System.out.println("остался кредита " + creditAfter + "осталось месяцев: " + i);

        }
        if (creditAfter > 0){
            System.out.println("У вас не получилось погасить кредии за 12 месяцев.");
            System.out.println("Оставшийся кредит: " + creditAfter );
            System.out.println("изначальный кредит: " + credit);
            System.out.println("полный кредит с процентами: " + credit2);
        }

    }
}
