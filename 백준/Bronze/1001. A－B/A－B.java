import java.util.Scanner;

public class Main{
public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in);
    
    String input = scanner.nextLine();
    
    String[] numbers = input.split(" ");
    
    int a = Integer.parseInt(numbers[0]);
    int b = Integer.parseInt(numbers[1]);
    int sum = sumNum(a, b);
    
    System.out.println(sum);
    
    scanner.close();
    }
    
    public static int sumNum(int a, int b){
        return a - b;
    }
}