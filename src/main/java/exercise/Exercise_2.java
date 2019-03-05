package exercise;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {


        takeParametersFromUser();
    }

    public static void takeParametersFromUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int firstValue = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int secondValue = scanner.nextInt();
        fractionalForm(firstValue, secondValue);
    }

    public static void fractionalForm(int a, int b) {

        if ((a == 0) || (b == 0)) {
            System.out.println("Invalid Value");
        }
        int myInteger = a / b;
        int remainder = a % b;

        if (remainder == 0) {
            System.out.println("Liczba " + a + " dzielone'a przez " + b + " rowna sie " + myInteger);
        }
        else {
            System.out.println("Liczba " + a + " dzielone'a przez " + b +
                    " rowna sie " + myInteger + " i " + remainder + "/" + b);
        }

    }
}
