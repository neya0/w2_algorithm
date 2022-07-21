
/*array의 각 element 중 divisor로 나누어 떨어지는 값을
오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.*/

import java.util.Arrays;

public class remainder {

    public int[] solution(int[] arr, int divisor) {
        int index = 0;
        Arrays.sort(arr);

        for(int i : arr){
            if(i % divisor == 0){
                index++;
            }
        }

        if(index == 0){
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[index];
        index = 0;

        for(int num : arr){
            if(num % divisor == 0){
                answer[index] = num;
                index++;
            }
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        remainder go = new remainder();
        int[] arr1 = {5,9,7,10};
        int divisor = 5;
        System.out.println(go.solution(arr1, divisor));

    }

}
