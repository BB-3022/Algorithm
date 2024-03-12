import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        //큐 인터페이스를 구현한 클래스를 사용 - 생성패턴
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0 ; i<N ; i++){
            queue.offer(i+1);
        }
        Integer num = 0;
        Integer result = 0;

        while(true){
            if(queue.size() > 1){
                queue.poll();
                 num = queue.poll();
                queue.offer(num);
            }else{
                result = queue.peek();
                break;
            }
        }
        System.out.println(result);

        sc.close();
    }
}