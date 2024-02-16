import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        // 입력받은 문자 한글자씩 배열로 저장
        char[] arr = word.toCharArray();

        // 영문 알파벳 갯수(26)
        char[] alphabet = new char[26];

        // 결과 값 저장 배열
        int[] result = new int[26];

        // result 를 -1로 초기화
        for(int d=0;d<result.length;d++){
            result[d] = -1;
        }

        // 'A'의 ASCII 코드 값에 i를 더해 알파벳 저장
        for(int i=0; i<alphabet.length; i++){
            alphabet[i] = (char)('a'+i);
        }

        for(int j=0;j<arr.length;j++){
            for(int k=0;k< alphabet.length;k++){
                if(arr[j] == alphabet[k]){
                    if(result[k]== -1){
                        result[k] = j;
                        break;
                    }else{
                        break;
                    }
                }
            }
        }

        for(int c:result){
            System.out.print(c + " ");
        }
    }
}