package Quiz11_20;//https://school.programmers.co.kr/learn/courses/30/lessons/12910

import java.util.Arrays;

//for를 돌려서 배열안에 인덱스값을 자연수 로 나눠서 떨어지면
//answer배열에
public class Quiz14 {
    public int[] solution(int[] arr, int divisor) {
        int count = 0; //카운트변수
        for (int i = 0; i < arr.length; i++) {  //파라미터값인 arr의 길이만큼 반복
            if(arr[i]%divisor == 0){ // arr값을 divisor 로 나누었을때 남는 값이 0일때
                count++; // count 변수 값을 1씩 증가한다.
            }
        }

        int[] answer = new int[count]; // 위 반복문을 나와서 1씩 올라간 count값으로 answer[]배열의 길이를 지정
        //----------------------------------------위 과정은 answer에 배열길이를 지정해주기 위한 코드
        
        count = 0; 
        for (int i = 0; i < arr.length; i++) { //arr의 길이만큼 반복
            if(arr[i]%divisor == 0){ // arr값을 divisor 로 나누었을때 남는 값이 0일때
                answer[count]=arr[i]; //answer에 arr[i]의 인덱스값을 저장
                count++; // answer의 인덱스를 올리기 위한 증감식
            }
        }

        Arrays.sort(answer); //Arrays.sort() 오름차순 정렬
                             //Arrays.sort(배열변수명, Collections.reverseOrder()); 내림차순 정렬 내장클래스.메소드

        if(answer.length == 0){ //제한 조건에 arr의 안에 값이 없을때 true
            answer = new int[1]; // answer배열 new int[1]로 다시 초기화
            answer[0] = -1; // answer[0] 에 -1 저장
        }
        return answer;
    }

    public static void main(String[] args) {
        Quiz14 dap = new Quiz14();
        System.out.println(Arrays.toString(dap.solution(new int[]{5, 9, 7, 10}, 5)));
    }
}
