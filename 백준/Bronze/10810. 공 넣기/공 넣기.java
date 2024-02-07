import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 바구니의 갯수
        int N = sc.nextInt();
        // 공을 넣을 횟수
        int M = sc.nextInt();

        int[] arr = new int[N];

        int str = 0;
        int end = 0;
        int number = 0;

        for(int i=0; i<M; i++){
            str = sc.nextInt();
            end = sc.nextInt();
            number = sc.nextInt();

            for(int j=str-1; j<end; j++){
                arr[j] = number;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}