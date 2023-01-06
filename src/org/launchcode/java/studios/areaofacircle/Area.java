package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //double pi = 3.14;
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        System.out.println("The area of a circle is: " + Circle.getArea(radius));
       // Circle.getArea(radius);
    }

}
