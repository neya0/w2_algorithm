package QuizList;

public class Quiz13 {
    public static void main(String[] args){
        SolutionQuiz13 method = new SolutionQuiz13();
        int a = 5;
        int b = 24;
        String answer = method.solution(a,b);
        System.out.println(answer);
    }
}


class SolutionQuiz13 {
    public String solution(int a, int b) {
        String answer = "";
        int numsOfdays= 366; //윤년은 366일
        int [] numsarray = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;

        for (int i=0; i<numsarray.length;i++){

            if (a>i+1){
                sum = sum + numsarray[i];
            }else{
                sum= sum+b;
                break;
            }
        }

        int daysnumber= sum % 7;

        switch(daysnumber) {
            case 0:
                answer = "THU";
                break;
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
        }
        return answer;
    }
}
