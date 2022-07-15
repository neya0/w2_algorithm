//문제 설명
//프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
//전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

//phone_number는 길이 4 이상, 20이하인 문자열입니다.

//입출력 예
//phone_number	return
//"01033334444"	"*******4444"
//"027778888"	"*****8888"


public class Quiz9 {
    public String solution(String phone_number) {
        String answer = phone_number; //값을 받아온다
        char[] chars = answer.toCharArray(); // answer 문자열을 char배열로 변환해서 글자를 쪼갠다.
        for(int i=0;i<answer.length()-4;i++){ // 뒤에 4글자만 변환이 안되게 하기 위해서 answer문자열의 길이에 -4를 하여 반복
            chars[i]='*'; // 반복문이 진행되는동안 chars[i]안에 '*' 로 적용
        }

        return String.valueOf(chars); //String.valueOf()은 지정된 chars배열을 문자열로 변경시켜주는메소드
    }

    public static void main(String[] args) {
        Quiz9 dap = new Quiz9();
        System.out.println(dap.solution("01011112222"));


    }
}

