package Test;

public class Quiz1 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        for(int i=0;i<arr1.length;i++){
            if (29<=arr2[i]){
                arr2[i]=21;
            }
            answer += (12-arr1[i]) + (arr2[i]-12);
        }
        return answer;
    }

    public static void main(String[] args) {
        Quiz1 method = new Quiz1();
        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
        System.out.println(method.solution(arr1, arr2));
    }

}
