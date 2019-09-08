import java.util.Scanner;

public class SpaceDigits{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        boolean inputValid = false;
        int num = 0;
        while(!inputValid){
            System.out.print("Please enter a 5-digit integer: ");
            num = input.nextInt(); 
            if(num > 9999 && num < 100000){
                inputValid = true;
            }
            else{
                System.out.println("Please input a valid 5-digit integer.");
            }
        }
        oddCheck(num); 
        System.out.printf("Digits in %d are ", num);
        String numStr = Integer.toString(num);
        for(int i = 0; i < numStr.length()-1; i++){
            System.out.print(numStr.charAt(i));
            System.out.print(' ');
        }
        System.out.println(numStr.charAt(numStr.length()-1));
    }
    public static void oddCheck(int num){
        if(num % 2 == 0){
            System.out.println("Your integer is even");
        }
        else{ 
            System.out.println("Your integer is odd");
        }
    }
}
