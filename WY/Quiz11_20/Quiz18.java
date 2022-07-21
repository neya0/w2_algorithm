package Quiz11_20;
//https://school.programmers.co.kr/learn/courses/30/lessons/12919

public class Quiz18 {
    public String solution(String[] seoul) {
        String answer = ""; //정답
        for(int i=0;i<seoul.length;i++){ // 문자열 배열 seoul길이 만큼 반복
            if(seoul[i].equals("Kim")){ // seoul배열 안에 "Kim"이라는 문자열이 있으면 true 없으면 false
                answer = "김서방은 "+i+"에 있다"; // 고정된 문장에 이덱스 값을 넣어서 answer에 초기화
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] dap = new String[]{"Kim","jin"};
        for(int i=0;i< dap.length;i++){
            if(dap[i].equals("Kim")){
                System.out.println("김서방은"+i+"에 있다");
            }
        }

    }
}
