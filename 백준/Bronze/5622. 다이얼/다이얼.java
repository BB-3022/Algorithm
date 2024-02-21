import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자입력
        String word = sc.nextLine();
        // 한글자씩 배열로 저장
        String[] num = word.split("");

        // 소요시간
        int time = 0;

        for(int i=0 ; i<num.length ; i++){
            if(num[i].equals("A") || num[i].equals("B") || num[i].equals("C")){
                time = time + 3 ;
            }else if(num[i].equals("D") || num[i].equals("E") || num[i].equals("F")){
                time = time + 4 ;
            }else if(num[i].equals("G") || num[i].equals("H") || num[i].equals("I")){
                time = time + 5 ;
            }else if(num[i].equals("J") || num[i].equals("K") || num[i].equals("L")){
                time = time + 6 ;
            }else if(num[i].equals("M") || num[i].equals("N") || num[i].equals("O")){
                time = time + 7 ;
            }else if(num[i].equals("P") || num[i].equals("Q") || num[i].equals("R") || num[i].equals("S")){
                time = time + 8 ;
            }else if(num[i].equals("T") || num[i].equals("U") || num[i].equals("V")){
                time = time + 9 ;
            }else if(num[i].equals("W") || num[i].equals("X") || num[i].equals("Y") || num[i].equals("Z")){
                time = time + 10 ;
            }
        }
        System.out.println(time);
    }
}