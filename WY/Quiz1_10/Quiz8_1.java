package Quiz1_10;//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

//제한사항
//arr은 길이 1 이상, 100 이하인 배열입니다.
//arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

//입출력 예
//arr	return
//[1,2,3,4]	2.5
//[5,5]	5

//https://school.programmers.co.kr/learn/courses/30/lessons/12944

public class Quiz8_1 {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i : arr){ // 향상된 for문을 사용하여 i에 arr의 값을 담는다.
            answer += i; // i(arr) 안에 값을 answer에 모두 더한다.
        }
        return answer/arr.length; // 향상된 for문에서 arr배열 안에 값을 더한 값에서 arr의 길이 만큼 나눈다
    }

    public static void main(String[] args) {
        Quiz8_1 dap = new Quiz8_1();
        System.out.println(dap.solution(new int[]{1,2,3,4}));
    }
}
