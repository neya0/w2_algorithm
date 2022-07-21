package Quiz21_30;
//https://school.programmers.co.kr/learn/courses/30/lessons/12947

import java.util.Arrays;

public class Quiz28 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String[] a = String.valueOf(x).split("");
        int[] b= new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i] = Integer.parseInt(a[i]);
        }

        for(int i=0;i<b.length;i++){
            sum += b[i];
        }

        if(x %sum ==0){
            answer=true;
        }else {
            answer=false;
        }

        return answer;
    }

    public static void main(String[] args) {
        int z =11;
        String[] a = String.valueOf(z).split("");
        System.out.println(Arrays.toString(a));
        int[] b= new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i] = Integer.parseInt(a[i]);
        }
        int sum = 0;
        for(int i=0;i<b.length;i++){
            sum += b[i];
        }
        if(z %sum ==0){
            System.out.println("답");
        }else {
            System.out.println("떙");
        }
    }
}
