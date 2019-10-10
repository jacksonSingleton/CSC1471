public class Switcher{
    public static void main(String[] args){
        for(int i = 0; i <= 6; i+=2){
            switch(i){
                case 0:
                    System.out.println("Hello there. ");
                    break;
                case 1:
                    System.out.println("What's up? ");
                    break;
                case 2:
                    System.out.println("How are you doing? ");
                    break;
                case 3:
                    System.out.println("Terrific. ");
                    break; 
                case 4:
                    System.out.println("Beautiful day isn't it? ");
                    break;
                case 5:
                    System.out.println("Yes it is. ");
                    break;
                default:
                    System.out.println("See you later.");
            }
        }
    }
}
