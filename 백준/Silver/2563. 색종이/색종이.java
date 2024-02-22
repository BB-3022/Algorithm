import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int [][] arr = new int[101][101];
        int result = 0;

        for(int i=0;i<count;i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    arr[X+j][Y+k] = 1;
                }
            }
        }

        for(int j=0;j<101;j++){
            for(int k=0;k<101;k++){
                if(arr[j][k]==1){
                    result+=1;
                }
            }
        }
        
        System.out.println(result);

    }
}