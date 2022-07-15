//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//재한사항
//s는 길이가 1 이상, 100이하인 스트링입니다.
//https://school.programmers.co.kr/learn/courses/30/lessons/12903


public class Quiz3 {
    public String solution(String s) {
        String answer = ""; //답안 적는 변수
        int num = s.length(); // 파라미터값의 길이 저장
        if (num % 2 == 0) { // 길이 % 2 == 0 짝수
            answer = s.substring(num / 2 - 1, num / 2 + 1); // subString메소드사용  , subString(start,end) 방식이며 그 abcd가 들어가면 a=0 , b=1 , c=2, d=3 (4/2-1,4/2+1) == (1,2) bc
        } else { // 길이 %2 ==0 이 안되면 무조건 홀수
            answer = s.substring(num / 2, num / 2 + 1); // 방식은 위방식과 동일
        }
        return answer;
    }

    public static void main(String[] args) {
        Quiz3 dap = new Quiz3();
        System.out.println(dap.solution("abcd")); // 정답 출력코드
    }
}
