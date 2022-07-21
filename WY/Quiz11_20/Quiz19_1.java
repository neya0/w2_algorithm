package Quiz11_20;

public class Quiz19_1 {

    public String watermelon(int n){ //파라미터 값을 받아온
        String result = ""; // 수 / 박 을 담을 문자열 변수
        for (int i = 0; i < n; i++) // 받아온 파라미터 값만큼 반복!
            result += i % 2 == 0 ? "수" : "박"; // i 를 나누기 2 했을때 남는 값이 0이면
                                // 삼항 연산자로 인해 왼쪽이true 이므로 수를 더함
        return result;
    }
}
