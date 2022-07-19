package Quiz21_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://school.programmers.co.kr/learn/courses/30/lessons/12935
public class Quiz26 {
    public int[] solution(int[] arr) {

        Arrays.sort(arr);
        if (arr.length == 1) {
            int[] answer = new int[]{-1};
            return answer;
        }

        int[] answer = new int[arr.length - 1];
        int min = arr[0];
        System.out.println(min);
        int cnt = 0;

        for(int i=arr.length;0>=i;i--){
            if(arr[i]==min){
                continue;
            }
            answer[cnt++] = arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
       Quiz26 dap = new Quiz26();
        System.out.println(Arrays.toString(dap.solution(new int[]{4,3,2,1})));

    }
}
