package com.bridgelabz;

import java.util.Scanner;

public class CalculateLengthOfLineUC1 {

     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Please enter x1 :");
          int x1 = scanner.nextInt();

          System.out.println("Please enter y1 :");
          int y1 = scanner.nextInt();

          System.out.println("Please enter x2 :");
          int x2 = scanner.nextInt();

          System.out.println("Please enter y2 :");
          int y2 = scanner.nextInt();
          scanner.close();
          /**
           * Creating line object
           */
          Line line = new Line(x1,y1, x2, y2);
          System.out.println("Length of the line :" + line.getLineLength());
     }
}




