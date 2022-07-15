class Solution {

    ///두 정수의 합
    public long solution(int a, int b) {
        long answer = 0;
        if (b >= a){
            for(long i=a; i<b+1; i++){
                answer = answer + i;
            }
        }else {
            for(int i=b; i<a+1; i++){
                answer = answer + i;
            }
        }
        return answer;
    }
}