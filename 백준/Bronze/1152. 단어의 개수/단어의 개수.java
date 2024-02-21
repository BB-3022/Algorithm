import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();
        String[] list = str.split(" ");

        int count = 0;
        
        for(String word : list){
            if(!word.isEmpty()){
                count ++;
            }
        }
        System.out.println(count);
    }
}