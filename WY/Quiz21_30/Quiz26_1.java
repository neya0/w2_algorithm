package Quiz21_30;

import java.util.Arrays;
//if로 사이즈 1이면 -1 리턴
//Arrays.sort()
//원본 배열보다 작은 사이즈의 배열을 생성
//for answer[0] continue

//Arraylist 사용해서

//자바 배열자르기 Arrays.copyOfRange() 찾아보기
public class Quiz26_1 {
    public int[] solution(int[] arr) {

        if(arr.length == 1){ // 넘어온 값의 배열의 길이가 1이면
            int[] answer = {-1}; //배열에 -1를 초기화
            return answer; //리턴한다/
        }


        int[] answer = new int[arr.length-1]; //작은값을 빼면 배열의 길이가 줄어드니 받은 배열길이 -1

        int min = arr[0]; // 받아온배열의 작은값을 확인하기 위해 비교용 배열값 초기화

        for(int i=1; i<arr.length; i++){ //arr의 길이만큼 반복
            min = Math.min(min, arr[i]); // 위 받아온 배열 값과 arr[i]의 값을 비교해서 작은값을 초기화
        }

        int index = 0; // answer 배열에 넣기위한 카운트 변수

        for(int i=0; i<arr.length; i++){ //arr의 길이만큼 반복
            if(arr[i] == min){ // 배열의 값이  min의 값과 같다면
                continue; //contunue를 이용해서 위 부분은 무시하고 반복 지행
            }
            answer[index++] = arr[i]; // 인덱스 번호에 맞춰 answer에 초기화
        }

        return answer;
    }





    public static void main(String[] args) {
        Quiz26_1 dap = new Quiz26_1();



    }
}




