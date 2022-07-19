package Quiz21_30;
//https://school.programmers.co.kr/learn/courses/30/lessons/12931

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Quiz22 {
    public int solution(int n) {
        int answer = 0;
        String[] arr  = String.valueOf(n).split(""); // 넘어온int값을 String타입배열로 변환
        for(int i=0; i<arr.length;i++){ // 배열의 길이만큼 반복
            answer += Integer.parseInt(String.valueOf(arr[i])); // answer에 Interge.parseInt()로 문자를 변환
        }
        return answer; // 변환된 answer 리턴
    }

    public static void main(String[] args) {
        int a = 123;
        int dap =0;
        String[] arr  = String.valueOf(a).split("");
        for (String s : arr) {
            dap += Integer.parseInt(s);
        }
        System.out.println(dap);
    }
}
