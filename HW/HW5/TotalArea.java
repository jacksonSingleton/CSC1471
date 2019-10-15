import java.util.Scanner;
public class TotalArea{
    public static void main(String[] args){
        double total = 0.0;
        Scanner input = new Scanner(System.in);
        CalcArea area = new CalcArea();
        boolean running = true;
        double base, height, width, radius;
        while(running){
            System.out.print("What shape would you like to calculate the area for?\n1)Triangle\n2)Rectangle\n3)Circle\n");
            int choice = input.nextInt();
            switch(choice){
                case(1):
                    System.out.print("Please input a base:"); 
                    base = input.nextDouble(); 
                    System.out.print("Please input a height:"); 
                    height = input.nextDouble(); 
                    double triangleArea = area.triangleArea(height, base);
                    System.out.printf("Area = %.3f\n", triangleArea);
                    total += triangleArea; 
                    break;
                case(2):
                    System.out.print("Please input a width:"); 
                    width = input.nextDouble(); 
                    System.out.print("Please input a height:"); 
                    height = input.nextDouble(); 
                    double rectArea = area.rectArea(width, height);
                    System.out.printf("Area = %.3f\n", rectArea);
                    total += rectArea;
                    break;
                case(3):
                    System.out.print("Please input a radius:"); 
                    radius = input.nextDouble(); 
                    double circArea = area.circArea(radius);
                    System.out.printf("Area = %.3f\n", circArea);
                    total += circArea;
                    break;
            }
            System.out.printf("Total Current Area: %.3f square units\n", total);
            System.out.print("Would you like to continue? y/N ");
            //running = (input.next() == "y") ? true : false; 
            char resume = input.next().charAt(0);
            if(resume == 'y' || resume == 'Y'){
                running = true;
            }
            else{
                running = false;
            }
        }
        System.out.printf("Your total calculated area is: %.3f\n", total);
    }
}
