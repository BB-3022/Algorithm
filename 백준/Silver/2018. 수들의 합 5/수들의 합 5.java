import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 1;
        int str = 1;
        int end = 1;
        int sum =1;

        while(end!=N){
            if(sum==N){
                count++; end++; sum = sum + end;
            }else if(sum>N){
                sum = sum - str; str++;
            }else{
                end++; sum = sum + end;
            }
        }
        System.out.println(count);
    }
}
