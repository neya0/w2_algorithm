package Quiz21_30;
//https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class Quiz25_1 {

    public long solution(long n) {
        long answer = 0; // 정답
        long sqrt = (long)Math.sqrt(n); //Math.sqrt(n) 함수를 이용하여 제곱근의

        if (Math.pow(sqrt, 2) == n) {
            answer= (long)Math.pow(sqrt + 1, 2);
        } else {
            answer =  -1;
        }
        return answer;
    }
}
