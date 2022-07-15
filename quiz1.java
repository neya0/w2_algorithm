import java.util.Scanner;


////  입력한 값에 따른 상자 그리기
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i;
        for (i=0; i<b; i++){
            System.out.println("*".repeat(a));
        }
    }
}