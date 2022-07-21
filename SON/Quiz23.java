package QuizList;
import java.util.*;

public class Quiz23 {
    public static void main(String[] args){
    SolutionQuiz23 method = new SolutionQuiz23();
    SolutionQuiz23_2 method2 = new SolutionQuiz23_2();
    int n = 12345;
    int n2 = 51685;
//    int[] answer = method.solution(n);
    int[] answer = method2.solution(n);
    System.out.println(Arrays.toString(answer));


    }
}

class SolutionQuiz23 {
    public int[] solution(long n) {

        char[] sort = String.valueOf(n).toCharArray();
        char tmp = 0;
        for(int i=0; i<sort.length; i++) {
            for(int j=i+1; j<sort.length; j++) {
                if(sort[i] < sort[j]) {
                    tmp = sort[i];
                    sort[i] = sort[j];
                    sort[j] =  tmp;
                }
            }
        }

        int[] answer = new int[sort.length];
        for(int i=0; i < sort.length;i++){
            answer[i] = sort[i]- '0';
        }

        return answer;
    }
}

class SolutionQuiz23_2 {
    public int[] solution(long n) {
        String str = String.valueOf(n);  // 문자로 변환
        String strArray[] = str.split(""); // 배열로 변환
        int[] array = Arrays.stream(strArray).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

class SolutionQuiz23_3{
    public int[] solution(long n) {
        String str = String.valueOf(n);
        char[] s = str.toCharArray();
        int[] answer = new int[str.length()];
        for(int i=str.length()-1;i>=0;i--) {//뒤집어서 입력
            answer[str.length()-1-i] = str.charAt(i)-'0';
        }
        return answer;
    }


}