import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 바구니의 갯수
        int N = sc.nextInt();
        // 변경 횟수
        int M = sc.nextInt();

        int[] arr = new int[N];

        // 바구니 번호 = 공 번호
        for(int j=0;j<arr.length;j++){
            arr[j]=j+1;
        }


        int ch=0;
        for(int i=0; i<M; i++){
            int I = sc.nextInt();
            int J = sc.nextInt();

            ch = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = ch;
        }

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}