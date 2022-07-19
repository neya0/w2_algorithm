package Quiz11_20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;

//https://school.programmers.co.kr/learn/courses/30/lessons/42576

public class Quiz20 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant); // Arrays.sort는 오름차순으로 정렬한다
        Arrays.sort(completion);  // Arrays.sort는 오름차순으로 정렬한다
        for (int i = 0; i < completion.length; i++) { //들어온 사람의 수 만큼 반복문
            if (!participant[i].equals(completion[i])) { //참가자[i]랑 완주랑[i]랑 같지 않으면 진행
                return participant[i]; // 같지 않으면 참가자값을 리턴한다.
            }
        }
        return participant[participant.length - 1]; // 같다면 참가자중 마지막을 리턴한다.
    }

//배열을 비교해서 삭제후 브레이크
    //배열을 솔트(정렬)
    public static void main(String[] args) {


        String[] a = new String[]{"mislav","stanko","mislav","ana"};
        String[] b = new String[]{"stanko","ana","mislav"};

        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));





    }
}

