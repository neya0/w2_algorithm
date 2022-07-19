package Quiz11_20;

//https://school.programmers.co.kr/learn/courses/30/lessons/12922

public class Quiz19 {
    public String solution(int n) {
        String answer = "";
        for(int i=0;i<n;i++) { // 받아온 파라미터의 값만큼 반복
            if (i % 2 == 0) { // 반복문 i를 2로 나눴을때 남는값이 0과 같을때 실행
                answer += "수"; //answer에 "수" 더함
            }
            if(i % 2 == 1){ // 반본문 i를 2로 나눴을때 남는값이 1과 같을때 실행
                answer += "박"; //answer에 "박" 더함
            }
        }
        return answer; // 반복된 값을 리터
    }

    public static void main(String[] args) {
        Quiz19 dap = new Quiz19();
        System.out.println(dap.solution(3));


    }

}
