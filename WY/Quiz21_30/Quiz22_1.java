package Quiz21_30;

public class Quiz22_1 {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) { // n의 값이 0이 아니면 계속 반복
            answer += n % 10; // answer에 n의 십으로 나눈 수를 계속 더함
            n /= 10; //n의 값을 10으로 나눈값을 n으로 초기화
        }

        return answer;
    }
}
