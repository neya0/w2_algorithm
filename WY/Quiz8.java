//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

//제한사항
//arr은 길이 1 이상, 100 이하인 배열입니다.
//arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

//입출력 예
//arr	return
//[1,2,3,4]	2.5
//[5,5]	5

//https://school.programmers.co.kr/learn/courses/30/lessons/12944

public class Quiz8 {
    public double solution(int[] arr) { // 파라미터값을 받아온다
        double answer = 0; // 정답
        for (int i=0;i<arr.length;i++){ //arr의 길이만큼 for문을 진행한다.
            answer += arr[i]; // answer에 arr[i]의 값을 모두 더한다.
        }
        return answer/arr.length; // answer / arr배열의 길이를 나눈다
    }

    public static void main(String[] args) {
        Quiz8 dap = new Quiz8();
        System.out.println(dap.solution(new int[]{1,2,3,4}));
    }
}
