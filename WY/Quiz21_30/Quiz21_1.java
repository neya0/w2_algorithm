package Quiz21_30;

public class Quiz21_1 {
    public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split(""); 

        for(String ss : array) { //foreach문 사용하여 arr내용을 ss에 담아서 반복문 진행
            cnt = ss.contains(" ") ? 0 : cnt + 1; //  ss안에 공백이 있다면 0을 반환 없다면 cnt +1 을 반환
            //contains()함수는 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수이다.
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); // 삼항연산자를 사용해서 cnt가 짝수면 소문자로 아니라면 대문자로 변환
        }
        return answer;
    }
    
}
