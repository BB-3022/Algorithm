import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        // 입력을 위한 BufferedReader 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 위한 BufferedWriter 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 승환이의 앞에 서 있는 학생들의 수를 입력받음
        int N = Integer.parseInt(br.readLine());
        // 학생들의 번호를 저장할 배열 선언
        int[] arr = new int[N];

        // 승환이 앞에 서있는 학생들의 번호표
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 학생들의 번호를 입력받음
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(sol(arr));
        br.close();
        bw.flush();
        bw.close();
    }
    // slo 메서도 : 승환이가 받을 수 있으면 Nice, 없으면 Sad 반환
    public static String sol(int[] stack){
        int orderNumber = 1;

        // 임시 저장 stack
        Stack<Integer> tmpStack = new Stack<>();

        for(int i=0;i< stack.length;i++){
            // 현재 번호가 찾는 번호와 다르면
            if(stack[i] != orderNumber){
                // 임시 스택이 비어있지 않고, 가장 위의 번호가 찾는 번호일 경우
                if(!tmpStack.isEmpty() && tmpStack.peek()==orderNumber){
                    tmpStack.pop(); // 임시 스택에서 번호를 제거
                    i--; // 다음 번호로 넘어가지 않도록 인덱스 조정
                    orderNumber++; // 다음 번호를 찾음
                }else{ // 찾는 번호가 아니면 임시 스택에 저장
                    tmpStack.push(stack[i]);
                }
            }else{ // 현재 번호가 찾는 번호와 같으면 다음 번호를 찾음
                orderNumber++;
            }
        }
        // 모든 번호를 받을 수 있는지 결과를 저장하는 변수
        boolean result = true;

        // 임시 스택에 남은 번호들을 확인
        for(int i=0;i<tmpStack.size();i++){
            int tmpValue = tmpStack.pop();

            // 남은 번호가 순서대로 나오는지 확인
            if(tmpValue == orderNumber){
                orderNumber++;
            }else{
                result = false;
                break;
            }
        }
        // 모든 번호를 순서대로 받을 수 있으면 "Nice", 아니면 "Sad" 반환
        return result ? "Nice" : "Sad";
    }
}
