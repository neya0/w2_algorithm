package Quiz21_30;
//https://school.programmers.co.kr/learn/courses/30/lessons/12930

import java.util.Arrays;

public class Quiz21 {
    public String solution(String s) {
        String answer = ""; //정답
        String[] arr = s.split(""); // split메소드를 사용하여 answer를 String 배열로 변환
        int cnt = 0; // 인덱스 번호
        for(int i=0;i<arr.length;i++){ //String 배열의 길이만큼 반복
            if (arr[i].equals(" ")){  // String배열에 공백이 있다면
                cnt = 0; //인덱스를 0으로 바꾼다
            }else if(cnt % 2==0){ //인덱스 번호가 짝수면
                arr[i] = arr[i].toUpperCase(); // String 배열의 문자를 대문자로 바꾼다
                cnt++; //바꾼 후 인덱스번호를 1씩 증가
            }else if (cnt % 2==1){ //인덱스 번호가 홀수면
                arr[i] = arr[i].toLowerCase();// String 배열의 문자를 소문자로 바꾼다
                cnt++; //바꾼 후 인덱스번호를 1씩 증가
            }
            answer += arr[i]; // 바꿔진 값을 answer에 초기화
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "try hello world";
        String dap ="";
        String[] arr = s.split("");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        int cnt = 0;
        for(int i =0; i<arr.length;i++){
            if (arr[i].equals(" ")){
                cnt = 0;
            }else if(cnt % 2==0){
                arr[i] = arr[i].toUpperCase();
                cnt++;
            }else if (cnt % 2==1){
                arr[i] = arr[i].toLowerCase();
                cnt++;
            }
            dap += arr[i];
        }
        System.out.println(dap);




    }
}
