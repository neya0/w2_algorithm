package Quiz21_30;
//https://school.programmers.co.kr/learn/courses/30/lessons/12934

public class Quiz25 {
    public long solution(long n) {
        long answer = 0; // 정답

        for(long i=0;i*i<=n;i++){ // i * i 값이 제곱근값 n과 작거나 같으면 반복
            if(i*i==n){ //i*i의 값이 n과 같으면 실행
                answer =(i+1)*(i+1); // 조건이 i+1 이기 때문에 제곱해서 answer에 초기화
            }else
                answer =-1; // 제곱근이 아니면 -1을 초기화
        }
        return answer;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = (int) Math.sqrt(a);
        System.out.println(b);
        if(Math.pow(b,2) == a ){
            System.out.println(Math.pow(b+1,2));
        }else
            System.out.println("-1");

    }
}
