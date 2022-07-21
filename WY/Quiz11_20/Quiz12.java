package Quiz11_20;//새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다. 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다. 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
//놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
//단, 금액이 부족하지 않으면 0을 return 하세요.

public class Quiz12 {
    public long solution(int price, int money, int count) {
        long answer = 0; // 정답
        long sum = 0; // 놀이공원의 총 이용로 계산을 위한 변수
        for(int i=1;i<=count;i++){ // for문에서 놀이공원 총 계산료를 구하기위해 반복
            sum += price * i; // 총 놀이공원 이용료
        }
        if(sum - money <=0){ // 총이용료 - 가진돈 이 0보다 작거나 같을때
            answer = 0; // 제한조건이 0이면 0을 반환해야 하기때문에 answer에 0을 준다
        }else { // 돈이 모자르기 때문에 총 이용료 - 가진돈을 answer에 저장
            answer = sum - money;
        }
        return answer;
    }

    public int park(int price, int money, int count) {
        int answer = 0;
        int sum = 0;
        for(int i=1;i<count+1;i++){
          sum += price * i; //이용료
        }
        if(sum - money <=0){
            answer = 0;
        }else {
            answer = sum - money;
        }
        System.out.println(sum);
        return answer;
    }

    public static void main(String[] args) {
        Quiz12 dap = new Quiz12();
        System.out.println(dap.park(3,20,4));

    }
}
