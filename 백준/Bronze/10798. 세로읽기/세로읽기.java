import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextLine();
        }

        for (int j = 0; j < 15; j++) {
            for (int k = 0; k < 5; k++) {
                if (arr[k].length()>j) {
                    char word = arr[k].charAt(j);
                    System.out.print(word);
                } else {
                    continue;
                }
            }
        }
    }
}