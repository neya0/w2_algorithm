package Quiz11_20;

public class Quiz12_1 {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
        //Marh.max() 내장함수는 Marh.max(a,b) a랑 b중에 큰수를 사용하는 함수입니다.
        // price(놀이공원) * (방문수 * (방문수 +1) / 2) - money, 0
        //               여기가 높으면 이쪽을...                 여기가 높으면 0을...
    }
}
