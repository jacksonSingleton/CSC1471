import java.util.Random;

public class RandomIntegers{
    public static void main(String[] args){
        Random randomNumbers = new Random();
        int face;
        int ones = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixes = 0;
        for(int i = 1; i <= 600000000; i++){
            face = 1 + randomNumbers.nextInt(6);
            /*System.out.printf("%d", face);
            if(i % 5 == 0){
                System.out.println();
            }*/
            if(face == 1){
                ones++;
            }
            else if(face == 2){
                twos++;
            }
            else if(face == 3){
                threes++;
            }
            else if(face == 4){
                fours++;
            }
            else if(face == 5){
                fives++;
            }
            else{
                sixes++;
            }
        }
        System.out.println("1s: " + ones);
        System.out.println("2s: " + twos);
        System.out.println("3s: " + threes);
        System.out.println("4s: " + fours);
        System.out.println("5s: " + fives);
        System.out.println("6s: " + sixes);
    }
}
