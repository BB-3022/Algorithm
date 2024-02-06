import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int result = 0;
        int Idx = 0;
        for(int j=0; j<arr.length; j++){
            if(arr[j]>result){
                result = arr[j];
                Idx = j;
            }
        }
        System.out.println(result);
        System.out.println(Idx+1);
    }
}