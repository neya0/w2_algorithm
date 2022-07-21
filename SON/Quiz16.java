package QuizList;
import java.util.Arrays;
import java.util.Objects;


//  == 과 equal은 다르다 !!
// 참조 https://coding-factory.tistory.com/536


public class Quiz16 {
    public static void main(String[] args){
        SolutionQuiz16 method = new SolutionQuiz16();
        String a1 = "pPoooyY";
        String a2 = "Pyy";

        boolean answer = method.solution(a2);
        System.out.println(answer);


    }
}


class SolutionQuiz16 {
    boolean solution(String s) {
        boolean answer = false;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        String[] array1 = s.split("" );      //  charAt 사용해도 될듯함.
        System.out.println(Arrays.toString(array1));
        int countp = 0;
        int county = 0;


////
//        for ( int i = 0; i < array1.length; i++){
//            if(Objects.equals(array1[i], "p")){
//                countp++ ;
//            }else if (Objects.equals(array1[i], "P")){
//                countp++;
//            }else if (Objects.equals(array1[i], "y")){
//                county++;
//            } else if (Objects.equals(array1[i], "Y")) {
//                county++;
//            }
//        }

// 기본 타입의 int형, char형등은 Call by Value 형태로 기본적으로 대상에 주소값을 가지지 않는 형태로 사용됩니다.

        for(int i =0; i<s.length();i++){
            if( s.charAt(i) == 'p'|| s.charAt(i) == 'P'){
                countp++;
            } else if (s.charAt(i) == 'y'|| s.charAt(i)=='Y') {
                county++;
            }
        }
//
//        큰따옴표(" ")는 문자열(String)을 감싸는 기호이고
//        작은따옴표(' ')는 문자(Character)를 감싸는 기호이다.
//
//        큰따옴표(" ") 사이에는 문자 여러개를 입력하고
//        작은따옴표(' ') 사이에는 문자 하나만 입력할 수 있다.


        System.out.println(countp);
        System.out.println(county);

        if (countp==county){
            answer = true;
        }

        return answer;
    }
}