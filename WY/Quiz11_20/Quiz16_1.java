package Quiz11_20;

public class Quiz16_1 {
    boolean solution(String s) {
        s = s.toLowerCase();
        int count = 0; // 갯수

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;
    }



}

