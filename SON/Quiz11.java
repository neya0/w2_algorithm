package QuizList;
import java.util.Arrays;

public class Quiz11 {
    public static void main(String[] args){
        SolutionQuiz11 method = new SolutionQuiz11();
        int x1 = 2;
        int x2 = 4;
        int x3 = -4;
        int n1 = 5;
        int n2 = 3;
        int n3 = 3;

        long[] answer =  method.solution(x2,n2);
        System.out.println(Arrays.toString(answer));

    }
}



class SolutionQuiz11 {
    public long[] solution(int x, int n) {
        long[] arr1 = new long[n];
        for(int i=0; i<n; i++){
            arr1[i]= (long)x*(i+1);
        }
        return arr1;
    }
}