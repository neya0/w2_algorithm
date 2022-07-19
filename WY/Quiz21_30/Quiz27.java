package Quiz21_30;
//https://school.programmers.co.kr/learn/courses/30/lessons/12943

public class Quiz27 {
    public static void main(String[] args) {
        int x = 6;
        int cnt=0;
        int dap =0;
        while (cnt==500){
            if(x%2==0){
                dap = x/2;
            }else {
                dap = x*3+1;
            }
            cnt++;

        }
        System.out.println(cnt);
    }
}
