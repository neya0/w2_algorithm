package QuizList;
import java.util.Arrays;

public class Quiz10 {
    public static void main(String[] args){
        SolutionQuiz10 method = new SolutionQuiz10();
        int [][] a_1 = {{1,2}, {2,3}};  // 4 6 , 7 9
        int [][] b_1 = {{3,4},{5,6}};

        int [][] a_2 = {{1},{2}};   // 4,  6
        int [][] b_2 = {{3},{4}};

        int [][] answer = a_1;

        answer = method.solution(a_1,b_1);
        System.out.println(Arrays.deepToString(answer));
        //Array.deepToString(값(다차원 배열 값)) 클래스.메서드 는 다차원배열을 출력할때 사용한다.
        //Array.toString() 클래스.메서드(1차원 배열 값)

    }
}


class SolutionQuiz10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
//         anwer [][] = new {};
//         배열이 생성안 됬기때문에 사용 못함.

        for(int i=0; i<arr1.length;i++){
            for(int j=0; j<arr1[i].length;j++){
                arr1[i][j] =arr1[i][j]+ arr2[i][j];
            }
        }


        return arr1;
    }
}