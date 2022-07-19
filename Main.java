package QuizList;

public class Main {
    public String solution(int month, int day) {
        String answer = "";
        int end = 98 ;
        int endMonth = 0;
        int endDay = 0;
        int [] numsarray = {31,28,31,30,31,30,31,31,30,31,30,31}; // 1년 12월 일수
        int month_day = numsarray[month-1]-day; // 시작하는 해당 달의 일수
        end -= month_day; // 해당 달의 일수를 뺌.


        while(end>=0){
            // 시작하는 월의 다음달
            if(month == 12) month =0;

            if(end >numsarray[month]){
                end = end - numsarray[month];
                month++;

            }else{
                endMonth = month+1;
                endDay = end;
                break;
            }

        }



        answer = ""+endMonth+"월 "+endDay+"일";
        return answer;
    }



    public static void main(String[] args) {
        Main method = new Main();
        int a = 11;   //3월 5일      // 22년 1월 1일은
        int b = 27;
        int a_1 = 6; // 9월 28일
        int b_1 = 22;
        // 항해 1일 차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해주는 알고리즘을 만들어보자.

        System.out.println(method.solution(11, 27));
    }
}