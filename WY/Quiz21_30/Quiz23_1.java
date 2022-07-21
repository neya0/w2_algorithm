package Quiz21_30;

import java.util.Arrays;

public class Quiz23_1 {

    public int[] solution(long n) {
        String a = "" + n; //long타입을 문자열로 변환
        int[] answer = new int[a.length()]; // 문자열의 길이만큼 int배열 선언
        int cnt=0; // 카운트 변수

        while(n>0) {
            answer[cnt]=(int)(n%10); // answer[0] = 1234 answer[1] =123 answer=[2] 12 answer[3] = 1
            n /= 10; //while문을 끝내기 위하 n값에 /10
            cnt++; // 배열값을 지정하기 위한 증감식
        }
        return answer;
    }

    public static void main(String[] args) {
        Quiz23_1 dap = new Quiz23_1();
        System.out.println(Arrays.toString(dap.solution(12345)));

    }
}
