class Solution {
    // 짝수 홀수 구분
    public String solution(int num) {
        String answer = "";
        if (num%2==0){
            answer = "Even";

        }else{
            answer = "Odd";

        }


        return answer;
    }
}