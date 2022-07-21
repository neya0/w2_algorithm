import java.util.Arrays;

public class checkComplate {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int name = 0; name < completion.length; name++){
            if(participant[name] == completion[name]){
                answer = participant[name + 1];
            }else {
                answer = participant[name];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        checkComplate go = new checkComplate();
        String[] arr1 = {"leo", "kiki", "eden"};
        String[] arr2 = {"eden", "kiki"};
        System.out.println(go.solution(arr1, arr2));
    }


}
