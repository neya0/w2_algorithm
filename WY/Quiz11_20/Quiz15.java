package Quiz11_20;//https://school.programmers.co.kr/learn/courses/30/lessons/70128


import java.util.Arrays;

public class Quiz15 {
    public int solution(int[] a, int[] b) { //파라미터 값을 받아온다
        int answer = 0; // 정답
        for(int i=0;i<a.length;i++){ //동일한 길이의 배열이 오기때문에 a의 길이만큼 반복
            answer += a[i]*b[i]; // answer에 a[i] * b[i]의 값을 초기화
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = new int[]{-1,0,1};
        int[] b = new int[]{1,0,-1};
        int[] c = new int[a.length];
        int sum = 0;
        for(int i=0;i<a.length;i++){
        c[i] = a[i]*b[i];
        }
        for(int i=0;i<c.length;i++){
            sum += c[i];
        }

        System.out.println(sum);
    }

}
