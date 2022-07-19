package QuizList;

public class Quiz14 {


}
//
//class SolutionQuiz14 {
//    public int[] solution(int[] arr, int divisor) {
//
//        int count = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] % divisor == 0) {
//                count++;
//            }
//        }
//
//        if(count == 0) {
//            int[] answer = {-1};
//            return answer;
//        }
//
//        int[] answer = new int[count];
//
//        for(int i = 0, j = 0; i < arr.length; i++){
//            if(arr[i] % divisor == 0) {
//                answer[j++] = arr[i];
//            }
//
//        }
//
//        Arrays.sort(answer);
//
//          for(int i = 0; i < cnt - 1; i++){
//             for(int j = 0; j < cnt - 1 - i; j++){
//                 if(answer[j] > answer[j +1]){
//                     int temp = answer[j];
//                     answer[j] = answer[j+1];
//                     answer[j+1] = temp;
//                 }
//             }
//         }
////         배열 import 안쓰고 풀기
//
//
//        return answer;
//    }
//
