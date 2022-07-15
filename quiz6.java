class Solution {

    // 없는 숫자 더하기
    public int solution(int[] numbers) {
        int answer;

        int total=0;
        for(int j=0; j<10; j++){
            total = total+j; //1부터 9까지 더한값은 45
        }

        int sum=0;
        for(int i=0; i<numbers.length; i++){
            sum = sum +numbers[i];
        }

        answer = total-sum;

        return answer;
    }
}