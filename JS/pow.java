
/*임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.*/

public class pow {

    public long solution(long n) {
        long answer = 0;
        double square = Math.sqrt((double) n);

        if((square > 0) && (square % 1 == 0)){
            answer = (long) Math.pow((square + 1), 2);
        }else{
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        pow go = new pow();
        long num = 121;
        System.out.println(go.solution(num));
    }
}
