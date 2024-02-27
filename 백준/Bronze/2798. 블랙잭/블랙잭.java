import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 뽑는 카드의 수
        int cnt = sc.nextInt();
        int sum = sc.nextInt();

        // 입력 숫자 저장
        int[] arr = new int[cnt];

        int result = 0;
        int temp = 0;

        for(int i=0;i<cnt;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<cnt-2;i++){
            for(int j=i+1; j<cnt-1;j++){
                for(int k=j+1; k<cnt;k++){
                    result=arr[i] + arr[j] + arr[k];

                    if(sum==result){
                        System.out.println(result);
                        return;
                    }
                    if(result<sum && temp<result){
                        temp=result;
                    }

                }
            }

        }
        System.out.println(temp);
    }
}
