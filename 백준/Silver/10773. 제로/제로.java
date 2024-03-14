import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<N; i++){
            int num = sc.nextInt();

            if(num!=0){
                stack.push(num);
            }else{
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            System.out.println(0);
            return;
        }

        int result = 0;

        while(!stack.isEmpty()){
            int num = stack.pop();
            result+=num;
        }
        System.out.println(result);
    }
}