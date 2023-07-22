package ex1;

import java.util.Random;
import java.util.Scanner;

/*
* Sinh số ngẫu nhiên trong khoảng 1- 100
* */

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input number: ");
        int input = scanner.nextInt();

        Random random = new Random();
        int count =0;
        while (true) {
            int radNumber = random.nextInt(100);
            count++;
            System.out.println("Lan " + count + ": " + radNumber);
            if (radNumber == input) {
                break;
            }
        }
        System.out.println("Count: " + count);
    }
}
