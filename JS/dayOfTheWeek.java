public class dayOfTheWeek {

    /*2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
    두 수 a, b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수를 완성하세요.
    요일의 이름은 일요일부터 토요일까지 각각 "SUN,MON,TUE,WED,THU,FRI,SAT"입니다.
    예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.*/

    //a: Month, b: Day

    public String solution(int a, int b) {
        String answer = "";
        String[] day = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };

        int totalDays = 0;

        for(int num = 1; num < a; num++){
            if (num == 2){
                totalDays += 29;
            } else if ((num < 8 && num % 2 != 0) || (num > 7 && num % 2 == 0)){
                totalDays += 31;
            } else if((num < 8 && num % 2 == 0) || (num > 7 && num % 2 != 0)){
                totalDays += 30;
            }
        }
        int dayName = (totalDays + b) % 7;

        answer = day[dayName];

        return answer;
    }

    public static void main(String[] args) {
        dayOfTheWeek go = new dayOfTheWeek();
        System.out.println(go.solution(1, 3));

    }
}
