package Quiz11_20;//문제 설명
//2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
// 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
//
//입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

//제한 조건
//2016년은 윤년입니다.
//2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)

//입출력 예
//a	b	result
//5	24	"TUE"


public class Quiz13 {
    public String solution(int a, int b) {
        String answer = "";

        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"}; // 2016년의 1월이 금요일 부터 시작이니 배열의 시작을 금요일부터
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 2016년은 윤년이기 때문에 2월은 29까지 있으므로 1월부터 12월까지 일자를 배열에 저장

        int date = 0; // 일자를 계산하는 변수
        for( int i = 0; i < a-1; i++ ){ // a는 월이기 때문에 조건식을 a-1로 지정해서 1월달은 month[0] 이기때문에 0 / for문은 조건이 성립이 안되면 돌아가지 않음 그래서 1월은 조건식이  a<0이기떄문에 무시
                           // a-1 은 a로 진행하게되면 1월을 할수가 없음
            date += month[i]; // date변수에 month[i](월마다 일자)를 저장
        }
        date += b-1; // date변수는 위에 for문에서 월마다 일자가 저장이 되어있고 b(일)-1
        System.out.println(date%7);
        answer = day[date % 7]; //나머지 연산자  date값에서 7를 나누고 남은값을 인덱스로 기준하여 진행
                // 요일인덱스 번호를 answer에 저장

        return answer;
    }

    public static void main(String[] args) {
       /* String dap = "";
        String[]  week = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] day = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        for (int i=1;i<day.length;i++){

        }*/
        Quiz13 dap = new Quiz13();
        System.out.println(dap.solution(1,1));



    }
}
