import java.lang.Thread;
class Welcome1{

    public static void main(String args[])throws InterruptedException{
       //Write code here  
       
        for(int i = 1; i < 1000; i++){
            System.out.print(i + "\r");
            Thread.sleep(1000/i);
        } 
    }
}
