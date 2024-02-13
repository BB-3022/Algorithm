import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt() % 42;
        }
        // Stream의 중복된 값 지우는 방법 : distinct
        arr = Arrays.stream(arr).distinct().toArray();

        System.out.println(arr.length);
    }
}