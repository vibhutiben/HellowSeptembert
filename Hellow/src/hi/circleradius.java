package hi;

import java.util.Scanner;

public class circleradius {
    public static void main(String[] args) {
        double radius,area;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the area of circle");

        radius = input.nextDouble();
       input.close();

       area = Math.PI * radius * radius;
       System.out.println("area of the circle is  " + area);

    }
}
