import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        if(m <= 1000 && n <= 1000){
            for(int a = 0; a < n; a++){
                for(int b = 0; b < m; b++){
                     System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}