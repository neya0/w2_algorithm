import java.util.Arrays;

public class spaceX {

    public long[] solution(int x, int n) {
        long[] answer = new long [n];

        for(int i = 1; i <= n; i++){
            long num = x * i;
            answer[i-1] = num;
        }
        String toStringArr = Arrays.toString(answer);
        System.out.println(toStringArr);

        return answer;
    }

    public static void main(String[] args) {
        spaceX go = new spaceX();
        System.out.println(go.solution(-999999, 10));

    }
}
