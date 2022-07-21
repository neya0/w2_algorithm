package Quiz21_30;
//https://school.programmers.co.kr/learn/courses/30/lessons/12933

import java.util.Arrays;
import java.util.Collections;


public class Quiz24 {
    public long solution(long n) {
        long answer = 0; // 답
        String dap = ""; // 내림차순으로 변한 값 넣기위한 변수
        String[] arr = Long.toString(n).split(""); // long n을 String 배열로 변환
        Arrays.sort(arr, Collections.reverseOrder()); //  내림차순으로 변환
        //Arrays.sort(배열명, Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){ //배열의 길이만큼 반복
            dap += arr[i]; // 빈문자열에 배열 초기화
        }
        return answer=Long.parseLong(dap); // 메서드가 Long으로 리턴해야 되기때문에 Long으로 형변환 후 리턴
    }



    public static void main(String[] args) {
        long n = 118372;
        String dap = "";
        String[] a = Long.toString(n).split("");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());

        for (int i=0;i<a.length;i++){
            dap += a[i];
        }
        System.out.println(dap);










    }
}
