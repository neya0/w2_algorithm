import java.util.Arrays;

public class Quiz7 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<absolutes.length;i++){
            if(absolutes[i]>0){
                signs[i]=true;
            }else {
                signs[i]=false;
            }
            answer += absolutes[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Quiz7 dap = new Quiz7();
        System.out.println(dap.solution(new int[]{4,-7,12},new boolean[]{true,true,false}));


    }
}
