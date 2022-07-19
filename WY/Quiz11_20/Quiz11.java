package Quiz11_20;//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
// 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

//제한 조건
//x는 -10000000 이상, 10000000 이하인 정수입니다.
//n은 1000 이하인 자연수입니다.

//x	    n	answer
//2	    5	[2,4,6,8,10]
//4	    3	[4,8,12]
//-4	2	[-4, -8]

import java.util.Arrays;

public class Quiz11 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; //배열의 길이를 자연수인 n으로 지정
        for(int i=0;i<n;i++){ // 자연수n만큼 곱해야하니 n만큼 for문 반복
            answer[i] = (long)(i+1) * x; // answer[i] 에 (long)으로 형변환후 i+1 후 x값을 곱해서 배열에 저장
            // for안에 i값을 1을 넣어서 진행을 해봤으나 answer인덱스값도 1이 들어가서 answer[0] = 0 이 된다 그래서
            // (i+1)의 값으로 변경해서 진행을 해야 한다.
            // int의 범위가 약 20억정도인데 제한조건에 최대수로 계산을 해보니 천억이 넘어가서 (long)으로 형변환을 해야 문제가 없다!
        }
        return answer; //정답 리턴
    }

    public static void main(String[]args){
        Quiz11 dap = new Quiz11();
        System.out.println(Arrays.toString(dap.solution(2,5)));

    }
}
