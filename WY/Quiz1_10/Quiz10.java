package Quiz1_10;//행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행,
// 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아,
// 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

//제한 조건
//행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.

//입출력 예
//arr1	            arr2	        return
//[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
//[[1],[2]]	        [[3],[4]]	[[4],[6]]


import java.util.Arrays;

public class Quiz10 {
    public int[][] solution(int[][] arr1, int[][] arr2) { // 2차원 배열 파라미터값을 받음
        int[][] answer = new int[arr1.length][arr1[0].length];  // 2차원 배열 answer에 arr1[]의 길이와 arr1[][]의 길이를 넣는다.
        for(int i=0; i<arr1.length; i++) { // arr1[]길이 만큼 for문을 돌린다.
            for(int j=0; j<arr1[0].length; j++) { //arr1[][]길이 만큼 for문을 돌린다.
                answer[i][j] = arr1[i][j] + arr2[i][j]; // answer에 arr1[][]에 속해있는값과 arr2[][]에 속해있는 값을 더한다.
            }
        }
        return answer; //더한 값을 main 함수로 보낸다.
    }


    public static void main(String[] args) {
//        int[][] arr1 = new int[][]{{1,2},{2,3}};
//        int[][] arr2 = new int[][]{{3,4},{5,6}};
//        int[][] answer = new int[2][2];
//        for(int i=0;i<answer.length;i++){
//            for(int j=0;j<answer.length;j++){
//                answer[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(answer));
        Quiz10 dap = new Quiz10();

        int[][] arr1 = new int[][]{{1,2},{2,3}};
        int[][] arr2 = new int[][]{{3,4},{5,6}};
        System.out.println(Arrays.deepToString(dap.solution(arr1, arr2))); //Array.deepToString(값(다차원 배열 값)) 클래스.메서드 는 다차원배열을 출력할때 사용한다.
        //Array.toString() 클래스.메서드(1차원 배열 값)



    }
}
