import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        double a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.print("a kenarı için değer girin:");
        a= input.nextInt();
        System.out.print("b kenarı için değer girin:");
        b= input.nextInt();
        System.out.print("c kenarı için değer girin:");
        c= input.nextInt();
        double u;
        u= (a+b+c)/2;
        double Alan;
        Alan= sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin alanı: " + Alan);






    }
}