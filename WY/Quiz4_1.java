public class Quiz4_1 {

    public long solution(int a, int b) {
        long answer = 0;
        if (a != b) {
            for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
                answer += i;
            }
        } else {
            answer = a;
        }
        return answer;
    }

    public static void main(String[] args) {
        Quiz4_1 dap = new Quiz4_1();
        System.out.println(dap.solution(3, 3));
    }
}
