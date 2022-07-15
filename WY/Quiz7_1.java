public class Quiz7_1 {

        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for (int i=0; i<signs.length; i++)// for문을 signs의 개수 만큼 돌린다.
                answer += absolutes[i] * (signs[i]? 1: -1); // (signs[i]? 1: -1) 조건 연산자 이므로 signs[i]가 true면 1을 absolutes[i]에 곱해서 양수로 만들고
                                                            // signs[i]가 false면 -1을 absolutes[i]에 곱해서 음수로 만듭니다.
            return answer;
        }

}
