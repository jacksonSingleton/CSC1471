import java.lang.Thread;
import java.util.Scanner;
import java.util.Random;
class Welcome1{

    public static void main(String args[])throws InterruptedException{
       //Write code here  
        Scanner s = new Scanner(System.in);
        System.out.print("Please input a string: ");
        String line = s.nextLine(); 
        for(int i = 0; i < line.length(); i++){
            //System.out.print(line.charAt(i) + "\r");
            System.out.print(line.charAt(i));
            Thread.sleep(new Random().nextInt(60)+ 75);
        } 
        System.out.print('\n');
    }
}
