package ex1;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = scanner.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j = 1; j <=2*n-1; j++) {
                if(n-i < j && j < n+i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
