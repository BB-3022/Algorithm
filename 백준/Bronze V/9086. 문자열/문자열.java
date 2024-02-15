import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 테스트 갯수
        int N = sc.nextInt();
        sc.nextLine();
        // 첫글자, 마지막 글자 추출 후 저장할 배열
        String[] arr = new String[N];

        for(int i=0; i<N; i++){
            // 입력값
            String word = sc.nextLine();
            // 첫글자, 마지막 글자 추출 후, arr 저장
            arr[i] = word.charAt(0)+""+word.charAt(word.length()-1);
        }
        sc.close();
        
        for(String result:arr){
            System.out.println(result);
        }
    }
}