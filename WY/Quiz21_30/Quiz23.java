package Quiz21_30;
//https://school.programmers.co.kr/learn/courses/30/lessons/12932

import java.util.Arrays;
import java.util.Collections;

/*String[] b = String.valueOf(a).split("");
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println(Arrays.toString(b));*/

public class Quiz23 {

    public int[] solution(long n) { // 값을 받아옴
        String[] a = String.valueOf(n).split(""); // String배열 a로 n의값을 나눠서 문자열배열로 바꿈
        int[] answer = new int[a.length]; // 문자열 배열만큼 int형 배열 생성
        for(int i=0;i<a.length;i++){ //int형 배열의 길이만큼 반복문
            answer[i] += Integer.parseInt(a[i]); //answer에 문자열배열 a를 int형으로 형변환후 초기화
        }
        //answer의 값 [1,2,3,4,5]
        int temp = 0; // answer에 값을 담을 변수
        for (int i = 0; i < answer.length/2; i++) { //
            temp = answer[i]; // 0 = 1  temp = 1
            answer[i] = answer[answer.length - i - 1];  // answer[0] = answer[4]
            answer[answer.length - i - 1] = temp; // answer[4] = temp;
        }



        return answer;
    }

    public static void main(String[] args) {
        Quiz23 dap = new Quiz23();
        System.out.println(Arrays.toString(dap.solution(12345)));




        /*int a = 12345;
        String[] b = String.valueOf(a).split("");
        int[] c = new int[b.length];
        for(int i=0;i<b.length;i++){
            c[i] += Integer.parseInt(b[i]);
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length-1;j++){
                if(c[j]>c[j+1]){
                    c[i]
                }
            }
            }
*/
        }





    }

