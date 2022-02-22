package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonUsingCompareToUC3 {
    /**
     * @param scanner
     * @return object containing int values
     */
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
        /**
         * Converting to Integer wrapper class and checking for equality
         */
        Integer val1=Integer.valueOf(line1.getLineLength());
        Integer val2=Integer.valueOf(line2.getLineLength());
        int compareVal = val1.compareTo(val2);
        if(compareVal == 0){
            System.out.println("Length of both lines are equal");
        }
        else if(compareVal == 1){
            System.out.println("Length of line 1 is greater than line 2");
        }
        else{
            System.out.println("Length of line 1 is less than line 2");
        }
    }
}




