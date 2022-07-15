public class Quiz10_1 {
    
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {}; //정답
        answer = arr1; // 2차원배열인 answer 안에 파라미터값(2차원배열) 저장
        for(int i=0; i<arr1.length; i++){ // arr1[][]의 길이 만큼 반복
            for(int j=0; j<arr1[0].length; j++){ // arr1[]의 길이 만큼 반복
                answer[i][j] += arr2[i][j]; // answer = arr1[][] 와 같기 때문에 arr2[][]를 더함
            }
        }
        return answer; //메인 함수로 리턴
    }

}
