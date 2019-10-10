import java.util.Random;
public class RandArray{
    public static void main(String[] args){
        int[] arr = new int [10];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100) + 1;
            System.out.println(arr[i]);
        }
    }
}
