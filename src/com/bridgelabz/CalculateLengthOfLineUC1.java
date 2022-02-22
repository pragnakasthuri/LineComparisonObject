package com.bridgelabz;

import java.util.Scanner;

/**
 * Utility class
 */
class Line {
     private int x1;
     private int y1;
     private int x2;
     private int y2;

     Line(int x1, int y1, int x2, int y2) {
          this.x1 = x1;
          this.y1 = y1;
          this.x2 = x2;
          this.y2 = y2;
     }

     /**
      * Creating getter and setter methods for the variables
      */
     public int getX1() {
          return x1;
     }

     public void setX1(int x1) {
          this.x1 = x1;
     }

     public int getY1() {
          return y1;
     }

     public void setY1(int y1) {
          this.y1 = y1;
     }

     public int getX2() {
          return x2;
     }

     public void setX2(int x2) {
          this.x2 = x2;
     }

     public int getY2() {
          return y2;
     }

     public void setY2(int y2) {
          this.y2 = y2;
     }
}

public class CalculateLengthOfLineUC1 {

     /**
      * @param line
      * Method for calculating length of a given line
      */
     public static void getLineLength(Line line){
          int val1 = (int) Math.pow((line.getX2()-line.getX1()), 2);
          int val2 = (int) Math.pow((line.getY2()-line.getY1()), 2);
          int lineLength = (int) Math.sqrt(val1+val2);
          System.out.println("Length of the Line :" +lineLength);

     }

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
          /**
           * Creating line object
           */
          Line line = new Line(x1,y1, x2, y2);
          CalculateLengthOfLineUC1.getLineLength(line);
     }
}




