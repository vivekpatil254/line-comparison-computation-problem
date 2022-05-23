package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonMain {

    public static void main(String[] args) {
        System.out.println("Welcome to 'Line Comparison Computation Program'");

        int x1, x2, x3, x4, y1, y2, y3, y4;
        int line1, line2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the X and Y co-ordinates for first point of line 1 : ");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();

        System.out.println("Enter the X and Y co-ordinates for second point of line 1 :");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        System.out.println("Enter the X and Y co-ordinates for first point of line 2 : ");
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();

        System.out.println("Enter the X and Y co-ordinates for second point of line 2 : ");
        x4 = scanner.nextInt();
        y4 = scanner.nextInt();

        line1 = (int) Math.sqrt(((x2 - x1) ^ 2) * ((x2 - x1) ^ 2) + ((y2 - y1) ^ 2) * ((y2 - y1) ^ 2));

        line2 = (int) Math.sqrt(((x4 - x3) ^ 2 * ((x4 - x3) ^ 2) + ((y4 - y3) ^ 2) * ((y4 - y3) ^ 2)));
    }


}