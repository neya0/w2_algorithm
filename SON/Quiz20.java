package QuizList;

import java.util.*;
import java.util.HashMap;  //해쉬


//해쉬 맵 사용방법
//https://reakwon.tistory.com/151
//https://coding-grandpa.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80-%EB%AA%BB%ED%95%9C-%EC%84%A0%EC%88%98-%ED%95%B4%EC%8B%9C-Lv-1
//https://blog.itcode.dev/posts/2021/12/14/programmers-a0010.html

public class Quiz20 {
    public static void main(String[] args){
    SolutionQuiz20 method = new SolutionQuiz20();
    String [] array1 = {"leo", "kiki", "eden"};
    String [] array1_1={ "eden", "kiki"};  // leo

    String [] array2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String [] array2_1={"josipa", "filipa", "marina", "nikola"}; // vinko

    String [] array3 = {"mislav", "stanko", "mislav", "ana"};
    String [] array3_1={"stanko", "ana", "mislav"};  // mislav

    String [] array4 = {"mislav", "stanko", "mislav", "ana"};
    String [] array4_1={"stanko", "mislav", "mislav"};  // ana




    String answer = method.solution(array3,array3_1);
    System.out.println(answer);

    }
}



class SolutionQuiz20 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

//        Arrays.sort(participant);  // 오름차순 정렬!!
//        Arrays.sort(completion);
//
//        for (int i = 0; i<completion.length; i++){
//            if(!participant[i].equals(completion[i])){
//                answer = participant[i];
//                return answer;
//            }else {
//                answer = participant[i+1];
//            }
//        }
//
// 해시사용방법
        //

        HashMap<String, Integer> map = new HashMap<>();
        for (String name : participant)
        { map.put(name, map.getOrDefault(name, 0) + 1); }  // 해쉬함수 디폴트값입력 여기서는  0

        for (String name : completion)
        {  map.put(name, map.get(name) - 1); }    // 갖고 있는 모든 키를 순회(keySet)

        for (String key : map.keySet())      // 모든 키를 불러온다.
        {  if (map.get(key) > 0)            // 키의 값이 0이면 완주, 0이 아니면 탈락자.
            { answer = key;
                break;
            }
        }





        return answer;
    }
}