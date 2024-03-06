import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 재료의 갯수
        int N = sc.nextInt();
        // 두 수의 목표 합
        int M = sc.nextInt();
        // 재료 저장
        int[] arr = new int[N];

        // 재료들의 고유 번호 입력
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        // 조건을 만족하는 횟수
        int count = 0;
        // 시작 인덱스
        int str = 0;
        // 종료 인덱스
        int end = N-1;

        while(str < end){
            int sum = arr[str] + arr[end];
            
            if(sum == M){
                count++; str++; end--;
            }else if(sum > M){
                end--;
            }else{
                str++;
            }
        }
        System.out.println(count);
    }
}
