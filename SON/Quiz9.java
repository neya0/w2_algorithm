package QuizList;

public class Quiz9 {
    public static void main(String[] args){

    }
}


class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        String star = "*";
        String num = phone_number.substring(length-4);
//        star = star.repeat(length-4);
        answer = star + num;


        return answer;
    }
}