package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle");
        double rectangleLength = input.nextDouble();
        System.out.println("What is the width of the rectangle");
        double rectangleWidth = input.nextDouble();
        System.out.println("The rectangles area is " + rectangleWidth/rectangleLength);
    }
}
