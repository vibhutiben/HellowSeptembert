package hi;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class hypotenus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side A value");
       double sideA= sc.nextDouble();
        System.out.println(" enter the side B value");
        double sideB = sc.nextDouble();

        double sideC = Math.sqrt((sideA*sideA) +(sideB*sideB)) ;
       System.out.println( sideC);

        }

    }

