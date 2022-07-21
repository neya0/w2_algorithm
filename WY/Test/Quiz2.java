package Test;

//기원이는 오늘 항해99를 시작했다. 성격이 급한 기원이는 항해 1일 차부터 언제 수료를 하게될 지 궁금하다.
//항해 1일 차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해주는 알고리즘을 만들어보자.

//1 ≤ month ≤ 12
//1 ≤ day ≤ 31 (2월은 28일로 고정합니다, 즉 윤일은 고려하지 않습니다.)

// month = 1
// day = 18
// return 4월 26일

public class Quiz2 {
    public String solution(int month, int day) {
        String answer = "";
        int d=98;
        if(1<=month && month<=12){

        }else if (1<=day && day<=31){

        }else {
            answer = "월,일 잘못 작성되었습니다.";
        }
        int[] mon = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};



        return answer;
    }

    public static void main(String[] args) {
        Quiz2 method = new Quiz2();
        System.out.println(method.solution(1, 18));
    }
}
