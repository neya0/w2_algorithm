public class Quiz4_1 {

    public long solution(int a, int b) { //파라미터 값을 받아서
        long answer = 0; // 정답
        if (a != b) { // a값이랑 b값이 같지 않다면 실행된다
            for (int i = Math.min(a, b); i <= Math.max(a, b); i++) { // for문에서 i의 값으로 Math.min(a,b) , Max.max(a,b) 작거나 같을때 까지 for문 실행
                         // Math.min(a,b) 는 a,b둘중 작은수를 선택, Math.max(a,b) 는 a,b 둘중 큰수를 선택한다.
                answer += i; //i=Math.min(a, b)  이기ㄸㄷㄷㄷㄷㄷ대문에 작은값에서 Max.max(a,b) 큰값까지 모두 answer에 더한다
            }
        } else {
            answer = a; // a=b랑 같기때문에 a로 지정한다
        }
        return answer;  //메인함수로 값을 보낸다.
    }

    public static void main(String[] args) {
        Quiz4_1 dap = new Quiz4_1();
        System.out.println(dap.solution(3, 3));
    }
}
