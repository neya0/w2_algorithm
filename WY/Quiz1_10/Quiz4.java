package Quiz1_10;//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

//제한 조건
//a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
//a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
//a와 b의 대소관계는 정해져있지 않습니다.

//https://school.programmers.co.kr/learn/courses/30/lessons/12912

public class Quiz4 {
    public long solution(int a, int b) {
        long answer = 0;

        if (a < b) { // a가 b보다 크면 실행
            for (int i = a; i <= b; i++) { // a값이 b보다 작거나 같을때  a를 1씩 더해라
                answer += i; // answer에 a의값을 반복해서 더해라!
            }
        } else {
            for (int i = b; i <= a; i++) { //b값이 a보다 작거나 같을때 b를 1씩 더해라
                answer += i; // answer에 b의값을 반복해서 더해라!
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Quiz4 dap = new Quiz4();
        System.out.println(dap.solution(3, 5)); //파라미터값을 보내서 결과값을 출려해라!
    }
}







