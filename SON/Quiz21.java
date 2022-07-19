package QuizList;
import java.util.Arrays;
import java.util.Locale;
import java.util.*;

public class Quiz21 {
    public static void main(String[] args){
        SolutionQuiz21 method = new SolutionQuiz21();
        SolutionQuiz12_2 method2 = new SolutionQuiz12_2();
        String s = "try hello world";  // "TrY HeLlO WoRlD".
        String s1 = "hard most hard";  // 조건의 문제를 보자 ~~
        String s2 = "Umjunsik ralo paka dopa";
        String answer =method.solution(s);
        System.out.println(answer);
//        String answer = method2.solution(s2);
//        System.out.println(answer);
    }

}


class SolutionQuiz21 {
    public String solution(String s) {
        String answer = "";
        String[] arrays = s.split(" ");  // {try,hello, world}
        String[] sumarraylist = new String[arrays.length];//{3개 }
        for(int i =0; i< arrays.length;i++){
            String [] arraylist = arrays[i].split("");  //{t,r,y }
//            System.out.println(Arrays.toString(arraylist));
            for(int j = 0; j<arraylist.length;j++){
                if(j%2==0){
                    String word = arraylist[j];
                    word = word.toUpperCase();
                    arraylist[j] = word;
                }else{
                    String word = arraylist[j];
                    word = word.toLowerCase();
                    arraylist[j] = word;
                }
            }
//            System.out.println(Arrays.toString(arraylist));
            String sumarray = String.join("",arraylist);
//            System.out.println(sumarray);
            sumarraylist[i] = sumarray;
//            System.out.println(Arrays.toString(sumarraylist));
            answer = String.join(" ",sumarraylist);
        }

        return answer;
    }
}

class SolutionQuiz12_2{
    public String solution(String s) {
        String answer = "";
        String[] array = s.split(""); // {t,r,y, ,h,~~}
        int listNum = 0;
        for(int i =0; i < array.length; i++){
            if(array[i].equals(" ")){
                listNum = 0;
            } else if (listNum % 2 ==0) {
                array[i]= array[i].toUpperCase();
                listNum++;

            }else{
                array[i]= array[i].toLowerCase();
                listNum++;
            }
        }
        answer = String.join("",array);

        return answer;
    }


}
