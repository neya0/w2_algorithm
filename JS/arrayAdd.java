import java.util.ArrayList;
import java.util.Arrays;

public class arrayAdd {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int column = arr1[0].length;
        int[][] answer = new int[row][column];

        for (int x = 0; x < row; x++){
            for(int y = 0; y < column; y++){
                answer[x][y] = arr1[x][y] + arr2[x][y];

                System.out.println(x);
                System.out.println(y);
            }
        }
        return answer;
    }

    public int[][] solution2(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int column = arr1[0].length;
        int[][] answer = new int [row][column];

        for (int x = 0; x < row; x++){
            for(int y = 0; y < column; y++){
                int arr1Number = arr1[x][y];
                int arr2Number = arr2[y][y];

                answer[x][y] = arr1Number + arr2Number;

                System.out.println(x);
                System.out.println(y);

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        arrayAdd go = new arrayAdd();
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};
        System.out.println(go.solution(arr1,arr2));
        System.out.println(go.solution2(arr1,arr2));

    }
}
