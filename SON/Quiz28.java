package QuizList;
import java.util.*;

public class Quiz28 {
    public static void main(String[] args){
        SolutionQuiz28 method = new SolutionQuiz28();
        int n = 10; //tr
        int n2 = 12; //tr
        int n3 = 11; //f
        int n4 = 13; //f
        boolean answer = method.solution(n2);
        System.out.println(answer);

    }
}


class SolutionQuiz28 {
    public boolean solution(int x) {
        int pure_x = x;
        int sum = 0;
        while(true){
            sum+=x%10;
            if(x<10)
                break;
            x=x/10;
        }
        System.out.println(sum);
        if(pure_x%sum==0){
            return true;
        }

        return false;

    }
}