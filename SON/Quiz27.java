package QuizList;
import java.util.*;;

public class Quiz27 {
    public static void main(String[] args){
        SolutionQuiz27 method = new SolutionQuiz27();
        SolutionQuiz27_2 method2 = new SolutionQuiz27_2();
        int n = 6; //8
        int n1 = 16; //4
        int n2 = 626331; // -1
        int n3 = 1;
        int answer = method.solution(n);
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/questions/7290 왜안되는지???

class SolutionQuiz27 {
    public int solution(int num_int) {
        int count = 0;
        long num = (long) num_int;
        for(int i = 0; i < 500; i++){
            if(num%2==0){
                num = num/2;
                count++;

            } else {
                if(num==1){
                    return count;
                }

                else{
                num = 3*num+1;
                count++;
                }
            }
        }

        return -1;
    }
}

class SolutionQuiz27_2 {
    public int collatz(int num) {
        long n = (long) num;
        for (int i = 0; i < 500; i++) {
            if (n == 1) return i;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
        }
        return -1;
    }
}