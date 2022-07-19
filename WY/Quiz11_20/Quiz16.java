package Quiz11_20;//https://school.programmers.co.kr/learn/courses/30/lessons/12916

public class Quiz16 {
    boolean solution(String s) {
        boolean answer = true; // 넘길 값
        s = s.toLowerCase(); // .toLowerCaser()메소드는 문자열s를 소문자로 바꿔주는 메소드
        int p = 0; // p 개수를 세기 위한 변수
        int y = 0; // y 개수를 세기 위한 변수

        for (int i = 0; i < s.length(); i++) { //문자열 s의 길이만큼 반복
            if (s.charAt(i) == 'p') {  // 반복문 동안 소문자 p가 있는지 확인
                //s.charAt(i) 메소드는 문자열 s 안에 있는 문자들을 인덱스번호 대로 저장하는 메소드
                p++; //소문자 p가 있으면 p를 1씩 증가
            } else if (s.charAt(i) == 'y'){ // 반복문 동안 소문자 y가 있는지 확인
                y++; //소문자 y가 있으면 p를 1씩 증가
            }
        }

        if (p == 0 && y==0) { // 논리연산자를 사용하여  p의개수가 0이거나 y의갯수가 0이면 answer를 true로
            answer = true;
        } else if(p==y){ // p갯수랑 y의갯수가 같으면 true
            answer = true;
        }else { //나머지는 false로 진행
            answer = false;
        }
         return answer;
    }





    public static void main(String[] args) {

        Quiz16 dap = new Quiz16();
        System.out.println(dap.solution("pPoooyY"));




    }
}
