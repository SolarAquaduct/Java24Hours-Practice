import java.util.Scanner;
public class Root {
    public static void main(String[] args){
        System.out.println("============== Sqaure root calculator ==============");
        System.out.println("Please enter a number");
        
        Scanner scanner = new Scanner(System.in);
        number num = new number();
        num.setNumber(scanner.nextDouble());
        double sqrtNumber = Math.sqrt(num.getNumber());
        
        System.out.println("The square root of " + num.getNumber() + " is: " + String.format("%.2f", sqrtNumber));
    }
}