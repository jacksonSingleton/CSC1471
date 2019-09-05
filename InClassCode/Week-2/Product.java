import java.util.Scanner;

public class Product{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        int x;
        int y;
        int z;
        int product; 
        System.out.printf("Enter your first number: ");
        x = input.nextInt();
        
        System.out.printf("Enter your second number: ");
        y = input.nextInt();
        
        System.out.printf("Enter your third number: ");
        z = input.nextInt();
        
        product = x * y * z;
        System.out.printf("The product is %d\n", product);
    }
}
