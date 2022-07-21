import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

public class strangeText {
    public String solution(String s) {
        String answer = "";
        String[] text = s.split("");
        int index = 1;

        for (int i = 0; i < text.length; i++){
            if(text[i].equals(" ")){
                answer += text[i];
                index = 1;
            } else if(index % 2 != 0){
                answer += text[i].toUpperCase();
                index++;
            }else if(index % 2 == 0){
                answer += text[i].toLowerCase();
                index++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        strangeText go = new strangeText();
        String textS = "try hello world";
        System.out.println(go.solution(textS));
    }
}
