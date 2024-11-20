package Projeckts;

import java.util.Scanner;

public class BaseSyntaksis1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how temperature in room ?");
        int temp = sc.nextInt();

        if (temp >= 25){
            System.out.println("contitsioner work in cool mode");
        }
        if (temp > 7 && temp < 25){
            System.out.println("conditsioner not working");
        }else {
            System.out.println("conditsioner work in heat mode");
        }
    }
}
