package QuizList;
import java.util.*;

public class Quiz22 {
    public static void main(String[] args){
        SolutionQuiz22 method = new SolutionQuiz22();
        int n = 123; // 6
        int n1 = 987;
        int answer = method.solution(n);
        System.out.println(answer);
    }
}


class SolutionQuiz22 {
    public int solution(int n) {

        String str = String.valueOf(n);
        int sum = 0 ;
        char [] sorts =  str.toCharArray(); // {1, 2, 3}
        int[] num = new int[sorts.length];
        for(int i =0 ; i<sorts.length; i++){
            num[i] = sorts[i]-'0';
            sum += num[i];
        }
        return sum;
    }
}

class SolutionQuiz22_2{
    public int solution(int n) {
        int answer = 0;

        while(true){
            answer+=n%10;
            if(n<10)
                break;
            n=n/10;
        }


        return answer;
    }
}