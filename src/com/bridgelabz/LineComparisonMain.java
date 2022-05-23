package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonMain {
    int x1, x2, x3, x4, y1, y2, y3, y4, line1, line2;

    public static void main(String[] args) {
        System.out.println("Welcome to 'Line Comparison Computation Program'");
        LineComparisonMain lineCompare = new LineComparisonMain();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the X and Y co-ordinates for first point of line 1 : ");
        lineCompare.x1 = scanner.nextInt();
        lineCompare.y1 = scanner.nextInt();

        System.out.println("Enter the X and Y co-ordinates for second point of line 1 :");
        lineCompare.x2 = scanner.nextInt();
        lineCompare.y2 = scanner.nextInt();

        System.out.println("Enter the X and Y co-ordinates for first point of line 2 : ");
        lineCompare.x3 = scanner.nextInt();
        lineCompare.y3 = scanner.nextInt();

        System.out.println("Enter the X and Y co-ordinates for second point of line 2 : ");
        lineCompare.x4 = scanner.nextInt();
        lineCompare.y4 = scanner.nextInt();
        lineCompare.equals();
        lineCompare.compareTo();

    }

    public void equals() {

        line1 = (int) Math.sqrt(((x2 - x1) ^ 2) * ((x2 - x1) ^ 2) + ((y2 - y1) ^ 2) * ((y2 - y1) ^ 2));
        line2 = (int) Math.sqrt(((x4 - x3) ^ 2 * ((x4 - x3) ^ 2) + ((y4 - y3) ^ 2) * ((y4 - y3) ^ 2)));
        if (line1 == line2)
            System.out.println("the line 1 and line 2 both are equal");
        else
            System.out.println("both line are not equal");
    }

    public void compareTo() {

        line1 = (int) Math.sqrt(((x2 - x1) ^ 2) * ((x2 - x1) ^ 2) + ((y2 - y1) ^ 2) * ((y2 - y1) ^ 2));
        line2 = (int) Math.sqrt(((x4 - x3) ^ 2 * ((x4 - x3) ^ 2) + ((y4 - y3) ^ 2) * ((y4 - y3) ^ 2)));

        if (line1 == line2)
            System.out.println("the line 1 and line 2 both are equal");
        else if (line1 > line2)
            System.out.println("the line 1 is greater than line 2");
        else
            System.out.println("the line 1 is less than line 2");
    }

}