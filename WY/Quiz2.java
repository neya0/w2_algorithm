//정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
//https://school.programmers.co.kr/learn/courses/30/lessons/12937

public class Quiz2 {

    public String solution(int num) { //메소드 정의
        String answer = ""; //홀짝 구분 변수
        if (num % 2 == 0) { // 숫자를 나눠서 0이되면 짝
            answer = "Even";
        } else { // 숫자를 나눠서 1이남으면 홀
            answer = "Odd";
        }
        return answer; //문자열 값을 메인함수로 넘김
    }

    public static void main(String[] args) {
        Quiz2 dap = new Quiz2();
        System.out.println(dap.solution(4)); //파라미터값을 줘서 메인에서 출력


    }
}
