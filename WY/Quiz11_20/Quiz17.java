package Quiz11_20;

//https://school.programmers.co.kr/learn/courses/30/lessons/12918

public class Quiz17 {
    public boolean solution(String s) { //파라미터 값 받는다.
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6) { //문자열 s의 길이가 4도 아니고 6도 아닌것은 false
                        // && and연산은 둘다 트루일때만 트루
            return answer=false; // 리턴값을 false로
        }
        for (int i=0;i<s.length();i++) { // s의 문자열 길이만큼 반복문
            if (s.charAt(i) < '0' || s.charAt(i) > '9') { // s.charAt(i)는 char자료형인데 연산자를 사용하면
                                                          // 아스키 코드로 변환하여 계산을 하게 된다.
                                                          // '0' = 48  , '9' = 57
                                                          // 48보다 작거나 || 57보다 위면 false를 초기화한다.
                //charAt(i)는 문자열안에 글자를 char자료형으로 변경해서 보여주는 메소드
                return answer =false;
            }
        }
        return answer=true;
    }




    public static void main(String[] args) {
        /*Quiz17 dap = new Quiz17();
        System.out.println(dap.solution("a234"));*/

        String s = "a1234";
        System.out.println(s.charAt(0));

        char a = 'a';
        System.out.println(a+"b");



    }
}
