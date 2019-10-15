import java.util.*;
public class BMI{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input your body weight to the nearest pounds: ");
        int weight = input.nextInt();
        System.out.print("Please input your height in inches: ");
        int height = input.nextInt();
        double bmi = bmiCalc(weight, height);
        //Float is %(totalSpace).(decimalRes)f
        System.out.printf("Your weight is %d pounds and your height is %d inches\n", weight, height); 
        System.out.printf("Your BMI is %5.2f. " + bmiCat(bmi), bmi);
        System.out.println("Underweight: weight < 18.5");
        System.out.println("Normal: 18.5 < weight < 24.9");
        System.out.println("Overweight: 25 < weight < 29.9");
        System.out.println("Obese: weight > 30");
    }
    public static double bmiCalc(int weight, int height){
        double bmi;
        bmi = (weight * 703.0) / (height * height * 1.0);
        return bmi;
    }
    public static String bmiCat(double bmi){
        if(bmi < 18.5){
            return "You are underweight\n";
        }
        else if(bmi >= 18.5 && bmi < 25){
            return "You are normal weight\n";
        }
        else if(bmi >= 25 && bmi < 30){
            return "You are overweight\n";
        }
        else if(bmi >= 30){
            return "You are obese\n";
        }
        else{
            return "INVALID INPUT";
        }
    }
}
