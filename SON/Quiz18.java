package QuizList;
import javax.swing.*;
import java.util.Arrays;
import java.util.Objects;

public class Quiz18 {
    public static void main(String [] args){
        SolutionQuiz18 method = new SolutionQuiz18();
        String[] seoul = {"Jane", "Kim"};
        String answer = method.solution(seoul);
        System.out.println(answer);

    }

}


class SolutionQuiz18 {
    public String solution(String[] seoul) {
        int point = 0;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                point = i;
                break;
            }
        }
        String answer = "김서방은 " +point+"에 있다";
        return answer;
    }
}