package ex1;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập m: ");
        m = scanner.nextInt();
        System.out.print("Nhập n: ");
        n = scanner.nextInt();

        for (int i=0; i<m;i++) {
            for (int j=0; j<n; j++) {
                if (i==0 || i==m-1 || j==0 || j==n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
