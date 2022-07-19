package QuizList;
import java.util.Arrays;

public class Quiz19 {
    public static void main(String[] args){
        SolutionQuiz19 method = new SolutionQuiz19();
        int n1 = 3;
        int n2 = 4;
        String answer = method.solution(n2);
        System.out.println(answer);

    }
}


class SolutionQuiz19 {
    public String solution(int n) {
        String answer = "";
        for(int i=0; i<n;i++){
            if(i%2==0){
                answer +="수";
            }else {
                answer += "박";
            }
        }
        return answer;
    }
}