package Projeckts;

import java.util.Scanner;

public class vihodKDoske {
    public static void main(String[] args) {
        System.out.println("введите вопрос");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        int random = (int) (Math.random() * 2);

        if (random == 0) {
            System.out.println("да");
        }
        if (random == 1 ) {
            System.out.println("нет");
        }
    }
}
