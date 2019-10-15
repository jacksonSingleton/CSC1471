import java.util.Scanner;

public class CalcCircumference{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius: ");
        double radius = input.nextDouble();
        System.out.printf("Diameter is %5.2f\n", (radius * 2.0));
        System.out.printf("Circumference is %5.2f\n", (radius * 2.0 * Math.PI));
        System.out.printf("Area is %5.2f\n", (radius * radius * Math.PI));
    }   
}
