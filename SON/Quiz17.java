package QuizList;
import java.util.Arrays;
import java.util.Objects;

public class Quiz17 {
    public static void main(String[] args){
        SolutionQuiz17 method = new SolutionQuiz17();
        String a1 = "a234";   // false
        String a2 = "1234";   // true
        String a3= "15f324";   /// false
        String a4 = "881642"; // true
        String a5 = "168765165"; // false
        boolean answer = method.solution(a4);
        System.out.println(answer);
    }
}

//      조건
//   if (length != 4 && length != 6)
//           return false;

class SolutionQuiz17 {
    public boolean solution(String s) {
        String nums = "1234567890";
        int count = 0;
        if(s.length() == 4 || s.length() == 6) {
            for(int i =0; i<s.length();i++){
                for(int j =0; j<nums.length(); j++){
                    if(s.charAt(i)!=nums.charAt(j)){
                    }else{
                        count++;
                    }
                }
            }
            if(count != s.length()){
                return false; //알파벳 포함일시 false
            }
        }else {
            return false;   //4,6 아닐시 false
        }
        return true; //4,6갯수 숫자포함
    }
}