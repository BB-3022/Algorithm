import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 입력받은 문자열
        String inputWord = sc.nextLine();

        // 찾고자 하는 위치
        int index = sc.nextInt();

        char result = inputWord.charAt(index-1);

        System.out.println(result);

    }
}

