import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[sc.nextInt()];
        int M = sc.nextInt();

        for(int j=0;j<N.length;j++){
            N[j] = j + 1;
        }

        for(int i=0;i<M;i++){
            int Left = sc.nextInt()-1;
            int Right = sc.nextInt()-1;

            while (Left<Right){
                int temp = N[Left];
                N[Left++] = N[Right];
                N[Right--] = temp;
            }
        }

        for(int k:N){
            System.out.print(k+" ");
        }
    }
}