import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // N 값도 포함, 기본 1로 시작
        int count = 1;

        for(int i=1 ; i<N ; i++) {
            int sum = 0;
            for(int j=i ; j<N ; j++){
                sum+=j;
                if(sum==N){
                    count++;
                    break;
                }else if(sum>N){
                    break;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
