public class Array2D{
    public static void main(String[] args){
        int total = 0;
        int[][] arr = {{1, 2}, {6,4,7,2}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                total += arr[i][j];
            }
        }
        System.out.println("Array totals: " + total);
    }
}
