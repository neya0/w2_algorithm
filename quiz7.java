class Solution {
    // 음양 더하기
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        int sum = 0;

        for(int i =0; i<signs.length;i++){
            if(signs[i]==true){
                sum = sum+absolutes[i];
            }else{
                sum = sum-absolutes[i];
            }
        }
        answer = sum;
        return answer;
    }
}