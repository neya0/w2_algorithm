package Quiz11_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz14_1 {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>(); //List

        for (int n : arr) { // arr에 담겨져있는
            if (n % divisor == 0) {
                list.add(n);
            }
        }

        if(list.isEmpty()) {
            list.add(-1);
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
