public class EnhancedForTest{
    public static void main(String[] args){
        int[] arr = {0, 1 ,2, 3};
        int total = 0;

        for(int i: arr){ total += i; }
        System.out.println(total);

    }
}
