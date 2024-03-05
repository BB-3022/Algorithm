import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 수의 개수 N
        int N = sc.nextInt();
        // 횟수 M
        int M = sc.nextInt();
        // 입력 숫자
        int[] arr = new int[N];
        // 누적 합 배열
        int[] prefixSum = new int[N+1]; // 인덱스 1부터 사용

        for(int i=0; i<N ; i++){
            arr[i] = sc.nextInt();
            // 누적 합 계산
            prefixSum[i+1] = prefixSum[i] + arr[i];
        }

        for(int j=0; j<M; j++){
            int str = sc.nextInt();
            int end = sc.nextInt();

            // 구간 합 계산: prefixSum[end] - prefixSum[str-1]
            int sum = prefixSum[end] - prefixSum[str-1];
            System.out.println(sum);
        }
        sc.close();
    }
}
