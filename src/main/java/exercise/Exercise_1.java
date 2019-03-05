package exercise;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {

        takeParametersFromUser();
    }

    public static void takeParametersFromUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int firstValue = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int secondValue = scanner.nextInt();
        printRange(firstValue, secondValue);
    }

    private static void printRange(int firstNumber, int secondNumber) {

        if (firstNumber < secondNumber) {
            while (firstNumber != secondNumber) {
                firstNumber++;
                if (firstNumber == secondNumber) {
                    break;
                }
                if (firstNumber % 2 == 0) {
                    System.out.println(firstNumber);
                }
            }

        } else if (secondNumber < firstNumber) {
            while (secondNumber != firstNumber) {
                secondNumber++;
                if (secondNumber == firstNumber) {
                    break;
                }
                if (secondNumber % 2 == 0) {
                    System.out.println(secondNumber);
                }
            }


        }

    }
}
