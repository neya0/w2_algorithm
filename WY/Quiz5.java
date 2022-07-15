//문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

//제한 조건
//s의 길이는 1 이상 5이하입니다.
//s의 맨앞에는 부호(+, -)가 올 수 있습니다.
//s는 부호와 숫자로만 이루어져있습니다.
//s는 "0"으로 시작하지 않습니다.

//입출력 예
//예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
//str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.

//https://school.programmers.co.kr/learn/courses/30/lessons/12925

public class Quiz5 {

    public int solution(String s) { //메소드 시작
        int answer = 0; //정답
        if (s.length() <= 5) { // 제한조건이 길이가 5이하라서 작성
            answer = Integer.parseInt(s); //answer = Integer.parseInt(s)함수를 사용해서 문자열을 숫자로 변경 -/+ 부호도 같이 출력, 0은 숫자기때문에 출력시 안보임
        }
        return answer; //답을 전달
    }

    public static void main(String[] args) {
        Quiz5 dap = new Quiz5();
        int cal = dap.solution("0123");
        System.out.println(cal);
    }
}
