package QuizList;

public class Quiz15 {
    public static void main(String[] args){
       SolutionQuiz15 method = new SolutionQuiz15();
       int[] a_1 = {1,2,3,4};  // 답 3
       int[] b_1 ={-3,-1,0,2};

       int[] a_2 = {-1,0,1 }; // 답 -2
       int[] b_2 = {1,0,-1 };

       int answer = method.solution(a_1,b_1);
       System.out.println(answer);

    }
}


class SolutionQuiz15 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i =0; i<a.length; i++){
            a[i] = a[i]*b[i];
            answer = answer + a[i];
        }

        return answer;
    }
}