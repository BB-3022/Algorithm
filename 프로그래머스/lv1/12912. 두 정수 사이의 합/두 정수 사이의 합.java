class Solution {
    public long solution(int a, int b) {
        
        long st;
        long end;
        
        if(a>b){
            st=b;
            end=a;
        }else{
            st=a;
            end=b;
        }
        
        long answer = 0;
        for(long i=st;i<=end;i++){
            answer += i;
        }
        return answer;
    }
}