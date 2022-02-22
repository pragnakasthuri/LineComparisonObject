package com.bridgelabz;

import java.util.Scanner;

public class CheckEqualityOfLinesUC2 {
    public static Line createLine(Scanner scanner) {
        System.out.println("Creating new line ");
        System.out.println("Please enter x1 :");
        int x1 = scanner.nextInt();

        System.out.println("Please enter y1 :");
        int y1 = scanner.nextInt();

        System.out.println("Please enter x2 :");
        int x2 = scanner.nextInt();

        System.out.println("Please enter y2 :");
        int y2 = scanner.nextInt();

        return new Line(x1, y1, x2, y2); // Line l1 = new Line();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Line line1 = createLine(scanner);
        Line line2 = createLine(scanner);
        System.out.println("Length of line1 : " + line1.getLineLength());
        System.out.println("Length of line2 : " + line2.getLineLength());
        scanner.close();

        String val1=String.valueOf(line1.getLineLength());
        String val2=String.valueOf(line2.getLineLength());

        if(val1.equals(val2)){
            System.out.println("Both lines are equal");
        }
        else {
            System.out.println("Both lines are not equal");
        }
    }
}




